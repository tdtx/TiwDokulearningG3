
package servlets;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

import dominio.FormularioCurso;
import es.uc3m.tiw.model.daos.CursoDAO;
import es.uc3m.tiw.model.daos.UsuarioDAO;
import es.uc3m.tiw.model.dominios.Curso;
import es.uc3m.tiw.model.dominios.Usuarios;



/**
 * Servlet implementation class Cursos
 */
@WebServlet("/Cursos")
public class Cursos extends HttpServlet {


	private ArrayList<FormularioCurso> cursos;
	private static final long serialVersionUID = 1L;
	public FormularioCurso cursoOferta;
	@PersistenceContext(unitName="Dokulearning-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	UsuarioDAO udao;
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
		udao=new UsuarioDAO(em, ut);
		cdao=new CursoDAO(em, ut);
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
		HttpSession sesion = request.getSession();
		List cursos = null;
		String accion = request.getParameter("accion");
		String estado = request.getParameter("estado");
		Long idUsuario = (Long) sesion.getAttribute("idUsuario");
		System.err.println(accion);
		String pagina = "/index.jsp";

		
		
		if(accion.equals("crearCurso")){
			Usuarios u =udao.buscarNick(estado); 
			
			sesion.setAttribute("cursos", u);
			pagina = "/formularioCurso.jsp";
			
		}
		
		if (accion != null) {
			System.err.println("super5"+accion);
			Curso u = cdao.buscarTitulo(accion);
			if( u!= null){
	
			sesion.setAttribute("perfilCurso", u);
			pagina = "/resumenCurso.jsp";
			System.err.println("entroooo");
			if (estado != null) {
				if (estado.equals("matricularse") && idUsuario != null) {
					sesion.setAttribute("perfilCurso", u);
					pagina = "/matriculacionDeCurso.jsp";
				}else{
					pagina = "/clienteNoValidado.jsp";
				}
			}
		}else{	System.err.println("malo");}
		}



		if (accion.equals("cursos")) {
			try {
				cursos = cdao.buscarCursos();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
