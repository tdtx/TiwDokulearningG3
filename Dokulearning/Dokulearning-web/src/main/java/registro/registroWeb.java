package registro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import dominio.validaciones;

/**
 * Servlet implementation class registroWeb
 */
@WebServlet("/registroWeb")
public class registroWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registroWeb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/registro.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		usuarioRegistro usr = new usuarioRegistro();
		
		
		
		usr.nick = request.getParameter("nick");
		usr.nombre = request.getParameter("nombre");
		usr.apellido1 = request.getParameter("apellido1");
		usr.apellido2 = request.getParameter("apellido2");
		usr.clave1 = request.getParameter("clave1");
		usr.clave2 = request.getParameter("clave2");
		usr.correo = request.getParameter("correo");
		usr.terminos = false;
		if (request.getParameter("terminos") != null)
			usr.terminos = true;

		usr.mayoredad = false;
		if (request.getParameter("mayoredad") != null)
			usr.mayoredad = true;

		
		String mensaje = usr.Validar(); 
		if (!mensaje.equals(""))
		{
			mensaje = "<ul>" + mensaje + "</ul>";
			request.setAttribute("mensaje", mensaje);

			this.getServletContext().getRequestDispatcher("/registro.jsp").forward(request, response);
			
		}
		else 
		{
			mensaje = "Te has registrado satisfactoriamente";
			request.setAttribute("mensaje", mensaje);
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

}
