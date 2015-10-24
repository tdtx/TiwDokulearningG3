package Cursos;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	
	public void init() throws ServletException{
		

		System.out.println("Servlet de Cursos");
		
		
	}
	
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
	
		
		String nom = request.getParameter("nom");
		String rama = request.getParameter("rama");
		String mensaje ="";
		HttpSession sesion = request.getSession();
		
		ArrayList<String> errores = new ArrayList<String>();
		
		response.setContentType("text/html");
		
		if(nom.equals("") || null == nom){
			errores.add("Nombre del curso vacio");
			
			
		}
		if(rama.equals("") || null == rama){
			errores.add("Rama/Campo del curso vacio");
			mensaje="Rama/Campo del curso vacio";
			request.setAttribute("mensaje", mensaje);
		}
		HttpSession curso = request.getSession();
		String accion = request.getParameter("accion");

		if(accion != null){
			if (errores.isEmpty()){
		//.getServletConfig()
			
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
			
		}
		else{
		
			this.getServletContext().getRequestDispatcher("/formularioCurso.jsp").forward(request, response);
			
		}
	
		this.getServletContext().getRequestDispatcher(FORM_JSP).forward(request, response);
		
		
		}
	}}
	

