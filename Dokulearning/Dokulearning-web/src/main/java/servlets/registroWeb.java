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

		
		//usuarios registrados	
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

		
		
		
		/*
		String rol, String nick, String clave, String nombre,
		String apellido1, String apellido2, int telefono, String correo,
		String cuentaBancaria, String idImagen, String fechanac,
		String descripcion, String aficiones, String calle, String localidad,
		int codigoPostal, String provincia, String pais)
		*/
		
		
		
		//usuarios matriculados
		Usuarios usuario11=new Usuarios("profesor", "Marquitos", "soymarcos", "Marcos", "Gonzalez", "Silo", 290909876, "mgs@mgs.mgs", "B9876pl9plok409876543", "fonts/users_folder_128.png", "05/09/1975", "Trabajo en Colme","me gusta ver partidos","Marques de torres", "Madrid", 28097, "Madrid", "Espanya");
		Usuarios usuario12=new Usuarios("profesor", "MarinaCL", "soymarina", "Marina", "Candela", "Lopez", 298709876, "mcl@mcl.mcl", "B9876789plok409876543", "fonts/users_folder_128.png", "05/09/1995", "Trabajo en Las rozas","me gusta el futbol","Marques de corbera", "Madrid", 28017, "Madrid", "Espanya");
		Usuarios usuario13=new Usuarios("profesor", "LauRF", "soylau", "Laura", "Ruiz", "Fernandez", 675453234, "lrf@lrf.lrf", "A5675tghy7865tghy4321", "fonts/users_folder_128.png", "06/04/1995", "vivo cerca","me gusta bailar"," De la vega", "Sanse", 78987, "Madrid", "Espanya");
		Usuarios usuario14=new Usuarios("profesor", "SaraTG", "soysara", "Sara", "Tena", "Garcia", 786543210, "stg@stg.stg", "Bjkiu7898ikju7876yhgt", "fonts/users_folder_128.png", "07/07/1990", "quiero ser programadora","me gusta el tenis","De las cercas", "Colme", 89076, "Madrid", "Espanya");
		Usuarios usuario15=new Usuarios("profesor", "PabloGH", "soypablo", "Pablo", "Garcia", "Hernandez", 390456238, "pgh@pgh.pgh", "A1234olki0987ujhy6789", "fonts/users_folder_128.png", "17/07/1991", "vivo en Colmenarejo","me gusta el baloncesto","Del abeto", "Leganes", 23098, "Madrid", "Espanya");
		Usuarios usuario16=new Usuarios("estudiante", "Sofi", "soysofi", "Sofia", "Rodriguez", "Marcos", 907879676, "srm@srm.srm", "B7897ujhy6543erfg4567", "fonts/users_folder_128.png", "18/10/1987", "hago pulseras","me gusta salir de fiesta","De las heras", "Salamanca", 23567, "Madrid", "Espanya");
		Usuarios usuario17=new Usuarios("estudiante", "Carmen", "soycarmen", "Carmen", "Alameda", "Muñoz", 900989765, "cam@cam.cam", "A12343456tghy789olkiu", "fonts/users_folder_128.png", "20/04/1900", "mi estuche es azul","me gustan las matematicas","Del martillo", "Las Rozas", 90897, "Madrid", "Espanya");
		Usuarios usuario18=new Usuarios("estudiante", "Ali", "soyali", "Alicia", "Pais", "Maravillas", 800900700, "apm@apm.apm", "Biolkolki89096787yhju", "fonts/users_folder_128.png", "12/12/1985", "me encanta el carlin","me gusta la programacion","San Ambrosio", "El Molar", 20986, "Madrid", "Espanya");
		Usuarios usuario19=new Usuarios("estudiante", "Alex", "soyalex", "Alejandro", "Fernandez", "Juarez", 567689733, "amj@amj.amj", "A09oi89iut56y4edfolki", "fonts/users_folder_128.png", "01/07/1993", "tengo bolis que se borran","me gusta ir al cine","Perez Herrera", "Sanagus", 12345, "Madrid", "Espanya");
		Usuarios usuario20=new Usuarios("estudiante", "Fran", "soyfran", "Francisco", "Martin", "Palacios", 908987123, "fmp@fmp.fmp", "Bhjui9876rfgt4321qas3", "fonts/users_folder_128.png", "19/11/1995", "estudio ade","me gusta ver la television","Sol", "Madrid", 13245, "Madrid", "Espanya");
		
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
