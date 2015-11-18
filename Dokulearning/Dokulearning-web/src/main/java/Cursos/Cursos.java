package Cursos;

import java.io.*;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

import registro.usuarioRegistro;
import es.uc3m.tiw.model.daos.CursoDAO;
import matriculacion.usuarioMatriculacion;

//import pruebasclase.Usuario;

/**
 * Servlet implementation class Cursos
 */
@WebServlet("/Cursos")
public class Cursos extends HttpServlet {

	private static final String INDEX_JSP = "/index.jsp";
	private static final String FORM_JSP = "/formularioCurso.jsp";
	private FormularioCurso fcurso;
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
		//cdao = new CursoDAO(em, ut);
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
		System.err.println(accion);
		String pagina = "/index.jsp";


		if (accion != null) {
			System.err.println("super5"+accion);
			FormularioCurso u = comprobarNom(accion);
			if( u!= null){
	
			sesion.setAttribute("perfilCurso", u);
			pagina = "/resumenCurso.jsp";
			System.err.println("entroooo");
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

				form.nom = request.getParameter("nom");
				form.descripcion = request.getParameter("descripcion");
				form.temario = request.getParameter("temario");
				form.secciones = request.getParameter("secciones");
				form.lecciones = request.getParameter("lecciones");
				form.material = request.getParameter("material");
				form.precio = request.getParameter("precio");
				form.horas = request.getParameter("horas");
				form.profesor = request.getParameter("profesor");
				form.f_inicio = request.getParameter("f_inicio");
				form.f_fin = request.getParameter("f_fin");
				form.cierre_curso = request.getParameter("cierre_curso");
				form.categoria = request.getParameter("categoria");
				form.dificultad = request.getParameter("dificultad");
				form.terminos = false;

				this.getServletContext()
						.getRequestDispatcher("/vistaPreviaCurso.jsp")
						.forward(request, response);

				break;
			case "vistaPrevia":

				form.nom = request.getParameter("nom");
				form.descripcion = request.getParameter("descripcion");
				form.temario = request.getParameter("temario");
				form.secciones = request.getParameter("secciones");
				form.lecciones = request.getParameter("lecciones");
				form.material = request.getParameter("material");
				form.precio = request.getParameter("precio");
				form.horas = request.getParameter("horas");
				form.profesor = request.getParameter("profesor");
				form.f_inicio = request.getParameter("f_inicio");
				form.f_fin = request.getParameter("f_fin");
				form.cierre_curso = request.getParameter("cierre_curso");
				form.categoria = request.getParameter("categoria");
				form.dificultad = request.getParameter("dificultad");
				form.terminos = false;
				this.getServletContext().getRequestDispatcher("/index.jsp")
						.forward(request, response);
				break;
			default:
				break;
			}

		}

	}
}
