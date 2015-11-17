package servlets;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dominio.usuarioRegistro;



/**
 * Servlet implementation class registroWeb
 */
@WebServlet("/registroWeb")
public class registroWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static ArrayList<usuarioRegistro> registrados;
	private static final String formularioReg = "/registro.jsp";
	private static final String indexJSP = "/index.jsp";
	/**	@PersistenceContext(unitName="Administracion-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	UsuarioDAO udao;

	
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
					"Holgado", "clavemch", "clavemch", "mch@mch.mch", true, true);
			usuarioRegistro ur2 = new usuarioRegistro("CAS", "Carol", "Arredondo",
					"Silo", "clavecas", "clavecas", "cas@cas.cas", true, true);
	
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

		HttpSession sesion = request.getSession();
		
		String action = request.getParameter("action");
		
		String estado = request.getParameter("estado");
		String pagina = indexJSP;
		System.err.println("valor" + estado);
		if (action != null && action.equals("salir")) {
			pagina = indexJSP;
			request.getSession().invalidate();
		}
		
	
		if (action != null && action.equals("perfil")&& estado!=null) {

			usuarioRegistro u=comprobarNick(estado);
			if( u!= null){
				pagina = "/perfilUsuario.jsp";
				sesion.setAttribute("perfilRegistrado", u);
				sesion.setAttribute("estadoValidacion", u.getNick());
				System.err.println("entro");
			}else{	System.err.println("malo");}
			
			
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
	public usuarioRegistro comprobarNick(String nick) {
		usuarioRegistro u = null;
		for (usuarioRegistro usuarioReg : registrados) {
			if (nick.equals(usuarioReg.getNick())) {
				u = usuarioReg;
				break;
			}
		}
		return u;
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
		
		HttpSession sesion = request.getSession();
		String distribucion = request.getParameter("distribucion");
		String pagina = indexJSP;
		String clave1 = null;
		String correo = null;
		switch(distribucion){
			
		case "iniciarSesion":
			clave1 = request.getParameter("clave1");				
			correo = request.getParameter("correo");
			
			try {
				usuarioRegistro u = comprobarUsuario(correo, clave1);
				if (u  != null) {
					pagina = "/index.jsp";
					request.setAttribute("registrados", registrados);
					sesion.setAttribute("usuario", u);
					sesion.setAttribute("acceso", "ok");
					sesion.setAttribute("correo", u.getCorreo());
					sesion.setAttribute("estadoValidacion", u.getNick());
					System.err.println("entro");
				}
				else {
					System.err.println("no entro");
					String mensaje = "Usuario o contraseña invalida";
					request.setAttribute("mensaje", mensaje);
				}
			}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println("ERROR: Usuario o contraseña invalida");
			}
			break;
			
			case "cambiarClave":
				String claveActual = request.getParameter("claveActual");
				String claveNueva = request.getParameter("claveNueva");
				String RclaveNueva = request.getParameter("RclaveNueva");
				if (claveActual != null) {

				
					cambiarClave(claveActual, claveNueva);
					request.setAttribute("registrados", registrados);
					pagina = "/perfilUsuario.jsp";
				}else{
					System.err.println("he petao");
				}
				
			
				break;
				
			case "crearRegistrado":
				
				String nick = request.getParameter("nick");
				String nombre = request.getParameter("nombre");
				String apellido1 = request.getParameter("apellido1");
				String apellido2 = request.getParameter("apellido2");
				 clave1 = request.getParameter("clave1");
				String clave2 = request.getParameter("clave2");
				 correo = request.getParameter("correoR");
				
				
				if (comprobarUsuario(correo, clave1) == null) {
					registrarRegistrado(nick, nombre, apellido1, apellido2, clave1,
							clave2, correo);
				
					usuarioRegistro u = comprobarUsuario(correo, clave1);
					sesion.setAttribute("usuarioReg", u);
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
			

			}

		}

	}
	
	
	public void cambiarClave(String claveActual, String claveNueva) {
		// TODO Auto-generated method stub

		for (usuarioRegistro cc : registrados) {
			if (claveActual.equals(cc.getClave1())) {
				cc.setClave1(claveNueva);
				cc.setClave2(claveNueva);

	

			}

		}

	}
	
	
	// añadir registrados al array
	public void registrarRegistrado(String nick, String nombre,
			String apellido1, String apellido2, String clave1, String clave2,
			String correo) {
		// TODO Auto-generated method stub
		registrados.add(new usuarioRegistro(nick, nombre, apellido1, apellido2,
				clave1, clave2, correo,true, true));
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
