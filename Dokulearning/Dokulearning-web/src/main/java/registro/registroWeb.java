package registro;

import java.io.IOException;
import java.util.ArrayList;

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
	private ArrayList<usuarioRegistro> registrados;
	private static final String formularioReg = "/registro.jsp";
	private static final String indexJSP = "/index.jsp";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public registroWeb() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();

		usuarioRegistro ur1 = new usuarioRegistro("MCH", "Maria", "Cañizares",
				"Holgado", "clave", "clave", "mch@mch.mch", true, true);
		usuarioRegistro ur2 = new usuarioRegistro("CAS", "Carol", "Arredondo",
				"Silo", "clave", "clave", "cas@cas.cas", true, true);

		registrados = new ArrayList<usuarioRegistro>();
		registrados.add(ur1);
		registrados.add(ur2);

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String action = request.getParameter("action");
		String pagina = indexJSP;
		if (action != null && action.equals("perfil")) {
			request.setAttribute("registrados", registrados);
			pagina = formularioReg;
		}

		if (action != null && action.equals("eliminarReg")) {
			String correo = request.getParameter("correo");
			eliminarRegistrado(correo);
			request.setAttribute("registrados", registrados);
			pagina = formularioReg;
		}

		response.setContentType("text/html");

		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);
	}

	private void eliminarRegistrado(String correo) {
		// TODO Auto-generated method stub
		int x = 0;
		for (usuarioRegistro perfil : registrados) {
			if (correo.equals(perfil.getCorreo())) {
				registrados.remove(x);
				break;
			}
			x++;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String nick = request.getParameter("nick");
		String nombre = request.getParameter("nombre");
		String apellido1 = request.getParameter("apellido1");
		String apellido2 = request.getParameter("apellido2");
		String clave1 = request.getParameter("clave1");
		String clave2 = request.getParameter("clave2");
		String correo = request.getParameter("correo");
		// String terminos = request.getParameter("terminos");
		// String mayoredad = request.getParameter("mayoredad");
		String pagina = indexJSP;

		if (comprobarUsuario(correo, clave1) == null) {
			registrarRegistrado(nick, nombre, apellido1, apellido2, clave1,
					clave2, correo);
			request.setAttribute("registrados", registrados);

		} else {

			try {
				RegistrarUser(nick, nombre, apellido1, apellido2, clave1,
						clave2, correo);
				request.setAttribute("registrados", registrados);
				pagina = formularioReg;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ERROR");
			}
		}

		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher("/prueba.jsp")
				.forward(request, response);

		/*
		 * usuarioRegistro usr = new usuarioRegistro();
		 * 
		 * usr.nick = request.getParameter("nick"); usr.nombre =
		 * request.getParameter("nombre"); usr.apellido1 =
		 * request.getParameter("apellido1"); usr.apellido2 =
		 * request.getParameter("apellido2"); usr.clave1 =
		 * request.getParameter("clave1"); usr.clave2 =
		 * request.getParameter("clave2"); usr.correo =
		 * request.getParameter("correo"); usr.terminos = false; if
		 * (request.getParameter("terminos") != null) usr.terminos = true;
		 * 
		 * usr.mayoredad = false; if (request.getParameter("mayoredad") != null)
		 * usr.mayoredad = true;
		 * 
		 * String mensaje = usr.Validar(); if (!mensaje.equals("")) { mensaje =
		 * "<ul>" + mensaje + "</ul>"; request.setAttribute("mensaje", mensaje);
		 * 
		 * this.getServletContext().getRequestDispatcher("/registro.jsp")
		 * .forward(request, response);
		 * 
		 * } else {
		 * 
		 * mensaje = "Te has registrado satisfactoriamente";
		 * request.setAttribute("mensaje", mensaje);
		 * this.getServletContext().getRequestDispatcher("/index.jsp")
		 * .forward(request, response); }
		 */
	}

	// editar
	private void RegistrarUser(String nick, String nombre, String apellido1,
			String apellido2, String clave1, String clave2, String correo) {
		// TODO Auto-generated method stub

		for (usuarioRegistro perfil : registrados) {
			if (correo.equals(perfil.getCorreo())) {
				perfil.setNick(nick);
				perfil.setNombre(nombre);
				perfil.setApellido1(apellido1);
				perfil.setApellido2(apellido2);
				perfil.setClave1(clave1);
				perfil.setClave2(clave2);
				// perfil.setTerminos(true);
				// perfil.setMayoredad(true);

			}

		}

	}

	// añadir registrados al array
	private void registrarRegistrado(String nick, String nombre,
			String apellido1, String apellido2, String clave1, String clave2,
			String correo) {
		// TODO Auto-generated method stub
		registrados.add(new usuarioRegistro(nick, nombre, apellido1, apellido2,
				clave1, clave2, correo));
	}

	// comprueba el array list y devuelve solo el que buscas
	private usuarioRegistro comprobarUsuario(String correo, String clave1) {
		usuarioRegistro u = null;
		for (usuarioRegistro usuarioReg : registrados) {
			if (correo.equals(usuarioReg.getCorreo())
					&& clave1.equals(usuarioReg.getClave1())) {
				u = usuarioReg;
				break;
			}
		}
		return u;
	}

}
