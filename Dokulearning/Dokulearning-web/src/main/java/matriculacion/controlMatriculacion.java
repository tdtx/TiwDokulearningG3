package matriculacion;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import matriculacion.usuarioMatriculacion.datosCobro;
import matriculacion.usuarioMatriculacion.genero;
import registro.usuarioRegistro;

/**
 * Servlet implementation class controlMatriculacion
 */
@WebServlet("/controlMatriculacion")
public class controlMatriculacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controlMatriculacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/matriculacionDeCurso.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		usuarioMatriculacion usr = new usuarioMatriculacion();
		
		usr.setTelefono(request.getParameter("telefono"));
		usr.setCalle(request.getParameter("calle"));
		usr.setLocalidad(request.getParameter("localidad"));
		usr.setCodigoPostal(request.getParameter("codigopostal"));
		usr.setProvincia(request.getParameter("provincia"));
		usr.setFechaNacimiento(request.getParameter("fechaNacimiento"));
		usr.setDNI(request.getParameter("DNI"));
		usr.setAceptar(false);
		if (request.getParameter("aceptar") != null)
			usr.setAceptar(true);
		
		switch(request.getParameter("genero")){
			case "hombre":
				usr.setSexo(genero.hombre);
				break;
			case "mujer":
				usr.setSexo(genero.mujer);
				break;
			default:
				usr.setSexo(genero.noDefinido);
		}
		

		switch(request.getParameter("formaPago")){
			case "transferencia":
				usr.setFormaPago(datosCobro.transferencia);
				break;
			case "tarjeta":
				usr.setFormaPago(datosCobro.tarjeta);
				break;
			case "paypal":
				usr.setFormaPago(datosCobro.paypal);
				break;
			default:
				usr.setFormaPago(datosCobro.noDefinido);
		}
		
		//usr.setNick(request.getParameter("nick"));
		
		
		String mensaje = usr.ValidarMatriculacion(); 
		if (!mensaje.equals(""))
		{
			mensaje = "<ul>" + mensaje + "</ul>";
			request.setAttribute("mensaje", mensaje);

			this.getServletContext().getRequestDispatcher("/matriculacionDeCurso.jsp").forward(request, response);
			
		}
		else 
		{
			mensaje = "Te has registrado satisfactoriamente";
			request.setAttribute("mensaje", mensaje);
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

}
