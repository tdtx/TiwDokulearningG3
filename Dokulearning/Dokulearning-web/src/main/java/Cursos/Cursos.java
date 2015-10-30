package Cursos;

import java.io.*; 
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dominio.validaciones;
//import pruebasclase.Usuario;

/**
 * Servlet implementation class Cursos
 */
@WebServlet("/Cursos")
public class Cursos extends HttpServlet {
	
	private static final String INDEX_JSP = "/index.jsp";
	private static final String FORM_JSP = "/formularioCurso.jsp";
	private FormularioCurso fcurso;
	private static final long serialVersionUID = 1L;
	
    /**
     * 
     * @see HttpServlet#HttpServlet()
     */
	
    public Cursos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(FORM_JSP).forward(request, response);
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



