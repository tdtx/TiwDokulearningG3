package servlets;

import java.io.IOException;
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

import dominio.usuarioRegistro;
import es.uc3m.tiw.model.daos.UsuarioDAO;
import es.uc3m.tiw.model.dominios.Usuarios;



/**
 * Servlet implementation class registroWeb
 */
//cuando arrancamos el servidor el servlet se llama a si mismo (loadOnStartUp
//toda la base de datos de carga aqui porque es el unico q se va a arrancar solo
@WebServlet(value="/registroWeb",loadOnStartup=1)
public class registroWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static ArrayList<usuarioRegistro> registrados;
	private static final String formularioReg = "/registro.jsp";
	private static final String indexJSP = "/index.jsp";
	@PersistenceContext(unitName="Dokulearning-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	UsuarioDAO udao;

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

		
			
		Usuarios usuario1=new Usuarios("MariaC", "clavemch", "Maria", "Canizares", "Holgado", "mch@mch.mch", "01/04/1992");
		Usuarios usuario2=new Usuarios("CarolAs", "clavecas", "Carolina", "Arredondo", "Silo", "cas@cas.cas", "20/06/1993");
		Usuarios usuario3=new Usuarios("TomasDTX", "clavetdtx", "Tomas", "Tee", "Xia", "tdtx@tdtx.tdtxc", "23/09/1990");
		Usuarios usuario4=new Usuarios("Antonio", "claveaml", "Antonio", "Martinez", "Alvarez", "ama@ama.ama", "16/04/1993");
		Usuarios usuario5=new Usuarios("ElsaCa", "claveecp", "Elsa", "Capunta", "Lapiz", "ecp@ecp.ecp", "08/11/1995");
		Usuarios usuario6=new Usuarios("JoseChu", "clavejlr", "Josechu", "Leton", "Rojo", "jlr@jlr.jlr", "22/08/1995");
		Usuarios usuario7=new Usuarios("AitorT", "claveat", "Aitor", "Tilla", null, "at@at.at", "09/09/1982");
		Usuarios usuario8=new Usuarios("BenitoC", "clavebc", "Benito", "Camela", null, "bc@bc.bc", "06/12/1978");
		Usuarios usuario9=new Usuarios("Layos", "clavealm", "Alejandro", "Layos", "Montero", "alm@alm.alm", "23/06/1993");
		Usuarios usuario10=new Usuarios("DPalomar", "clavedpal", "David", "Palomar", null, "dpal@dpal.dpal", "01/11/1967");

		udao=new UsuarioDAO(em, ut);
	try {
		udao.guardarUsuario(usuario1);
		udao.guardarUsuario(usuario2);
		udao.guardarUsuario(usuario3);
		udao.guardarUsuario(usuario4);
		udao.guardarUsuario(usuario5);
		udao.guardarUsuario(usuario6);
		udao.guardarUsuario(usuario7);
		udao.guardarUsuario(usuario8);
		udao.guardarUsuario(usuario9);
		udao.guardarUsuario(usuario10);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
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
		
	//para loguearse
		if (action != null && action.equals("perfil")&& estado!=null) {

			Usuarios u=udao.buscarNick(estado);
			if( u!= null){
				pagina = "/perfilUsuario.jsp";
				sesion.setAttribute("perfilRegistrado", u);
				sesion.setAttribute("estadoValidacion", u.getNick());
				System.err.println("entro");
			}else{	System.err.println("malo");}
			
			
		}
	//
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
		System.err.println("entro bien +"+distribucion);
		String pagina = indexJSP;
		String clave1 = null;
		String correo = null;
		switch(distribucion){
			
		case "iniciarSesion":
			clave1 = request.getParameter("clave1");				
			correo = request.getParameter("correo");
			
			try {
				Usuarios u = udao.buscarLogin(correo, clave1);
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
				//String RclaveNueva = request.getParameter("RclaveNueva");
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
				String apellido1 = request.getParameter("apellido1");
				 correo = request.getParameter("correoR");
				 clave1 = request.getParameter("clave1");
				String nombre = request.getParameter("nombre");
				String apellido2 = request.getParameter("apellido2");
				String fechanac= request.getParameter("fechanac");
				String clave2 = request.getParameter("clave2");
				//String aceptarterm = request.getParameter("aceptarterm");
				
				
				if (comprobarUsuario(correo, clave1) == null) {
					System.err.println("entro bien");
					registrarRegistrado(nick, apellido1, correo, clave1, nombre,
							apellido2, fechanac, clave2);
				
					usuarioRegistro u = comprobarUsuario(correo, clave1);
					sesion.setAttribute("usuarioReg", u);
					request.setAttribute("registrados", registrados);
					
			
					pagina = "/index.jsp";
					
				} else {
					System.err.println("entro mal");
					try {
						RegistrarUser(nick, nombre, apellido1, apellido2, clave1,
								clave2, fechanac, correo);
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
			String apellido2, String clave1, String clave2, String fechanac,String correo) {
		// TODO Auto-generated method stub

		for (usuarioRegistro perfil : registrados) {
			if (correo.equals(perfil.getCorreo())) {
				perfil.setNick(nick);
				perfil.setNombre(nombre);
				perfil.setApellido1(apellido1);
				perfil.setApellido2(apellido2);
				perfil.setClave1(clave1);
				perfil.setClave2(clave2);
				perfil.setFechanac(fechanac);
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
			String apellido1, String apellido2, String clave1, String clave2, String fechanac,
			String correo) {
		// TODO Auto-generated method stub
		registrados.add(new usuarioRegistro(nick, nombre, apellido1, apellido2,
				clave1, clave2, fechanac, correo, true));
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
