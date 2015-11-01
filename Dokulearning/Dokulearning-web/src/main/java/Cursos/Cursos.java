package Cursos;

import java.io.*;  
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



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
    /**	
     * 
     * @see HttpServlet#HttpServlet()
     */
	@Override
	public void init() throws ServletException {
		
		super.init();
				FormularioCurso curso1 = new FormularioCurso("Programacion en GLPK", "1234", "descripcion breve",
						"Tema1 Tema2 Tema3", "Aitor Tilla", "Heuristica y optimizacion", "imagenes/addressbook_add_128.png", "Alta"
						, "01-11-2015", "01-12-2015",
						"02-12-2015", "12");
				FormularioCurso curso2 = new FormularioCurso("Programacion en C++", "2334", "descripcion breve",
						"Tema1 Tema2 Tema3", "Aitor Menta", "Programacion", "imagenes/addressbook_add_128.png", "Alta"
						, "01-11-2015", "01-12-2015",
						"02-12-2015", "12");
				
				cursos = new ArrayList<FormularioCurso>();
				cursos.add(curso1);
				cursos.add(curso2);
				
			
				
	}
    public Cursos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accion = request.getParameter("accion");
		String pagina = "/index.jsp";
		if (accion.equals("ofertas")) {
			request.setAttribute("cursos", cursos);
			pagina = "/cursoOferta.jsp";
	
		}
		if(accion.equals("destacados")){
			request.setAttribute("cursos", cursos);
			pagina = "/cursoDestacados.jsp";
	}
		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		FormularioCurso form = new FormularioCurso();
		

		
		
		/*if (request.getParameter("terminos") != null)
			form.terminos = true;
		
		
		String mensaje = form.validarCurso(); 
		if (!mensaje.equals(""))
		{
			mensaje = "<ul>" + mensaje + "</ul>";
			request.setAttribute("mensaje", mensaje);

			this.getServletContext().getRequestDispatcher("/formularioCurso.jsp").forward(request, response);
			
		}
		else 
		{
			mensaje = "El curso se ha enviado para validar";
			request.setAttribute("mensaje", mensaje);
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
	}


		
	}
	*/





		/*String nom = request.getParameter("nom");
		
		String mensaje ="";
		HttpSession sesion = request.getSession();
		
		ArrayList<String> errores = new ArrayList<String>();*/
		
		response.setContentType("text/html");
		
		HttpSession curso = request.getSession();
		String action = request.getParameter("action");
		//String enviarValidar = request.getParameter("enviarValidar");
		if(action != null){
			//if (errores.isEmpty()){
		//.getServletConfig()
			switch(action){
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
			
			this.getServletContext().getRequestDispatcher("/vistaPreviaCurso.jsp").forward(request, response);
			
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
				//if(enviarValidar != null){
				this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			break;
			default:
				break;
			}
			/*this.getServletContext().getRequestDispatcher("/vistaPreviaCurso.jsp").forward(request, response);
			 * else{
			
				this.getServletContext().getRequestDispatcher("/formularioCurso.jsp").forward(request, response);
				
			}
		
			this.getServletContext().getRequestDispatcher(FORM_JSP).forward(request, response);
			
			
			}
			 * 
			 */
			
			
			
			
		}
		
			
		
	
		//this.getServletContext().getRequestDispatcher(FORM_JSP).forward(request, response);
		
	}}



