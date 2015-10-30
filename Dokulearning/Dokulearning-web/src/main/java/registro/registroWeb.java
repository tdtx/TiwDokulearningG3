package registro;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import dominio.validaciones;

/**
 * Servlet implementation class registroWeb
 */
@WebServlet("/registroWeb")
public class registroWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static ArrayList<usuarioRegistro> registrados;
	private static final String formularioReg = "/registro.jsp";
	private static final String indexJSP = "/index.jsp";
	private usuarioRegistro usuarioReg;


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

		if (registrados == null)
		{
			usuarioRegistro ur1 = new usuarioRegistro("MCH", "Maria", "Cañizares",
					"Holgado", "clave", "clave", "mch@mch.mch", true, true);
			usuarioRegistro ur2 = new usuarioRegistro("CAS", "Carol", "Arredondo",
					"Silo", "clave", "clave", "cas@cas.cas", true, true);
	
			registrados = new ArrayList<usuarioRegistro>();
			registrados.add(ur1);
			registrados.add(ur2);
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		HttpSession sesion = request.getSession(true);
		String action = request.getParameter("action");
		String pagina = indexJSP;
		
		//String clave = request.getParameter("clave1");
		//String correo = request.getParameter("correo");
		
		if (action != null && action.equals("perfil")) {
			//usuarioRegistro u = (usuarioRegistro) sesion.getAttribute("usuario");
			//request.setAttribute("usrperfil", u);
			
			/*usuarioRegistro registrados=comprobarUsuario(correo, clave);
			
			request.setAttribute("registrados", registrados);*/
			pagina = "/perfilUsuario.jsp";
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

	public void eliminarRegistrado(String correo) {
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
		
		HttpSession sesion = request.getSession(true);
		String distribucion = request.getParameter("distribucion");
		String pagina = indexJSP;
		
		switch(distribucion){
		
			case "cambiarClave":
				String claveActual = request.getParameter("claveActual");
				String claveNueva = request.getParameter("claveNueva");
				String RclaveNueva = request.getParameter("RclaveNueva");
				if (claveActual != null) {

				
					cambiarClave(claveActual, claveNueva);
					request.setAttribute("registrados", registrados);
					pagina = "/prueba.jsp";
				}else{
					System.err.println("he petao");
				}
				
			
				break;
				
			case "crearRegistrado":
				
				String nick = request.getParameter("nick");
				String nombre = request.getParameter("nombre");
				String apellido1 = request.getParameter("apellido1");
				String apellido2 = request.getParameter("apellido2");
				String clave1 = request.getParameter("clave1");
				String clave2 = request.getParameter("clave2");
				String correo = request.getParameter("correo");
				
				
				if (comprobarUsuario(correo, clave1) == null) {
					registrarRegistrado(nick, nombre, apellido1, apellido2, clave1,
							clave2, correo);
				
					usuarioRegistro u = comprobarUsuario(correo, clave1);
					sesion.setAttribute("usuarioReg", u);
					sesion.setAttribute("acceso", correo);
					request.setAttribute("registrados", registrados);
					
			
					pagina = "/perfilUsuario.jsp";
					
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
				
				break;
			
			default:
				
				break;
				
		}

		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);
		
		
		// String terminos = request.getParameter("terminos");
		// String mayoredad = request.getParameter("mayoredad");
				
		
	
		

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
	public void RegistrarUser(String nick, String nombre, String apellido1,
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
	
	
	public void cambiarClave(String claveActual, String claveNueva) {
		// TODO Auto-generated method stub

		for (usuarioRegistro cc : registrados) {
			if (claveActual.equals(cc.getClave1())) {
				cc.setClave1(claveNueva);
				cc.setClave2(claveNueva);

				// perfil.setTerminos(true);
				// perfil.setMayoredad(true);

			}

		}

	}
	
	

	// añadir registrados al array
	public void registrarRegistrado(String nick, String nombre,
			String apellido1, String apellido2, String clave1, String clave2,
			String correo) {
		// TODO Auto-generated method stub
		registrados.add(new usuarioRegistro(nick, nombre, apellido1, apellido2,
				clave1, clave2, correo));
	}

	// comprueba el array list y devuelve solo el que buscas
	public usuarioRegistro comprobarUsuario(String correo, String clave1) {
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
