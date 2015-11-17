package servlets;

import java.io.*;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import dominio.FormularioCurso;



/**
 * Servlet implementation class Cursos
 */
@WebServlet("/Cursos")
public class Cursos extends HttpServlet {


	private ArrayList<FormularioCurso> cursos;
	private static final long serialVersionUID = 1L;
	public FormularioCurso cursoOferta;
	/**	@PersistenceContext(unitName="Administracion-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	CursoDAO cdao;
	/**
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	@Override
	public void init() throws ServletException {

		super.init();
		FormularioCurso curso1 = new FormularioCurso("Programacion en GLPK",
				"1234", "descripcion breve", "Tema1 Tema2 Tema3",
				"Aitor Tilla", "Heuristica y optimizacion",
				"imagenes/addressbook_add_128.png", "Alta", "01-11-2015",
				"01-12-2015", "02-12-2015", "12");
		FormularioCurso curso2 = new FormularioCurso("Programacion en C",
				"2334", "descripcion breve", "Tema1 Tema2 Tema3",
				"Aitor Menta", "Programacion",
				"imagenes/addressbook_add_128.png", "Alta", "01-11-2015",
				"01-12-2015", "02-12-2015", "12");

		cursos = new ArrayList<FormularioCurso>();
		cursos.add(curso1);
		cursos.add(curso2);
		
	}
	
	public Cursos() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession(true);

		String accion = request.getParameter("accion");
		String estado = request.getParameter("estado");
		System.err.println(accion);
		String pagina = "/index.jsp";

		
		if (accion != null) {
			System.err.println("super5"+accion);
			FormularioCurso u = comprobarNom(accion);
			if( u!= null){
	
			sesion.setAttribute("perfilCurso", u);
			pagina = "/resumenCurso.jsp";
			System.err.println("entroooo");
			if (estado != null) {
				if (estado.equals("matricularse")) {
					sesion.setAttribute("perfilCurso", u);
					pagina = "/matriculacionDeCurso.jsp";
				}
			}
		}else{	System.err.println("malo");}
		}


		if (accion.equals("ofertas")) {
			request.setAttribute("cursos", cursos);
			pagina = "/cursoOferta.jsp";

		}
		if (accion.equals("destacados")) {
			request.setAttribute("cursos", cursos);
			pagina = "/cursoDestacados.jsp";
		}
		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);
	}
	private FormularioCurso comprobarNom(String nom) {
		FormularioCurso u = null;
		for (FormularioCurso f : cursos) {
			if (nom.equals(f.getNom())) {
				u = f;
				break;
			}
		}
		return u;
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		FormularioCurso form = new FormularioCurso();

		response.setContentType("text/html");

		HttpSession curso = request.getSession();
		String action = request.getParameter("action");

		if (action != null) {

			switch (action) {
			case "rellenar_formulario":


				this.getServletContext()
						.getRequestDispatcher("/vistaPreviaCurso.jsp")
						.forward(request, response);

				break;
			case "vistaPrevia":

				this.getServletContext().getRequestDispatcher("/index.jsp")
						.forward(request, response);
				break;
			default:
				break;
			}

		}

	}
}