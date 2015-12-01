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
		Usuarios usuario1=new Usuarios("MariaC", "clavemch", "Maria", "Canizares", "Holgado", "mch@mch.mch", "01/04/1992","Alumno");
		Usuarios usuario2=new Usuarios("CarolAs", "clavecas", "Carolina", "Arredondo", "Silo", "cas@cas.cas", "20/06/1993","Alumno");
		Usuarios usuario3=new Usuarios("TomasDTX", "clavetdtx", "Tomas", "Tee", "Xia", "tdtx@tdtx.tdtxc", "23/09/1990","Alumno");
		Usuarios usuario4=new Usuarios("Antonio", "claveaml", "Antonio", "Martinez", "Alvarez", "ama@ama.ama", "16/04/1993","Alumno");
		Usuarios usuario5=new Usuarios("ElsaCa", "claveecp", "Elsa", "Capunta", "Lapiz", "ecp@ecp.ecp", "08/11/1995","Alumno");
		Usuarios usuario6=new Usuarios("JoseChu", "clavejlr", "Josechu", "Leton", "Rojo", "jlr@jlr.jlr", "22/08/1995","Alumno");
		Usuarios usuario7=new Usuarios("AitorT", "claveat", "Aitor", "Tilla", null, "at@at.at", "09/09/1982","Alumno");
		Usuarios usuario8=new Usuarios("BenitoC", "clavebc", "Benito", "Camela", null, "bc@bc.bc", "06/12/1978","Alumno");
		Usuarios usuario9=new Usuarios("Layos", "clavealm", "Alejandro", "Layos", "Montero", "alm@alm.alm", "23/06/1993","Alumno");
		Usuarios usuario10=new Usuarios("DPalomar", "clavedpal", "David", "Palomar", null, "dpal@dpal.dpal", "01/11/1967","Alumno");

		
		
		
		//usuarios matriculados
		Usuarios usuario11=new Usuarios("LauLV", "clavelau", "Laura", "Lopez", "Vazquez", "20/08/1991", "llv@llv.llv", "Ayhju9876ujki8ujkujki", "fonts/users_folder_128.png", "Estudiante de cuarto curso de ADE", "La ciencia ficcion", "de las Heras", "Madrid", 28017, "Madrid", 786654321, "estudiante", "89776546y", "mujer");   
		Usuarios usuario12=new Usuarios("LidiRG", "clavelidi", "Lidia", "Rodriguez", "Garcia", "25/09/1992", "lrg@lrg.lrg", "Bikj7kilo098u7y6t5r4e", "fonts/users_folder_128.png", "Profesora de ciencias tecnologicas", "La enseñanza y el deporte", "de la Vega", "Las Rozas", 25089, "Madrid", 987654789, "profesor", "87698423z", "mujer");
		Usuarios usuario13=new Usuarios("RaulFJ", "soyraul", "Raul", "Fernandez", "Jimenez", "04/12/1985", "rfj@rfj.rfj", "Bikju7865tgh645rt3ew2", "fonts/users_folder_128.png", "Entusiasmado por el mundo sanitario", "El arte y viajar", "San Ambrosio", "Colmenarejo", 45367, "Madrid", 453567890, "profesor", "58754123p", "hombre");
		Usuarios usuario14=new Usuarios("MartinMF", "soymartin", "Martin", "Marquez", "Frias", "01/06/1978", "mmf@mmf.mmf", "Blkoi9oi87uy8ujhy6tgh", "fonts/users_folder_128.png", "Persona sociable y trabajadora", "El mundo del motor", "del Abeto", "El Molar", 98765, "Madrid", 987654289, "profesor", "98712385t", "hombre");
		Usuarios usuario15=new Usuarios("AliPM", "Soyali", "Alicia", "Pais", "Maravillas", "27/12/1992", "apm@apm.apm", "Bjkol0987ujhy6tgf4rfd", "fonts/users_folder_128.png", "Entusiasta y amable", "El mundo de la belleza", "Perez Herrera", "Leganes", 98765, "Madrid", 980765190, "estudiante", "90876123r", "mujer");
		Usuarios usuario16=new Usuarios("AlbaMP", "soyalba", "Alba", "Marin", "Palacios", "30/08/1970", "amp@amp.amp", "Aikjl0987ujhy5645rfgt", "fonts/users_folder_128.png", "Profesora proactiva y sociable", "El deporte y la musica", "del Globo", "Gestafe", 98765, "Madrid", 786542134, "profesor", "98765398u", "mujer");
		Usuarios usuario17=new Usuarios("MarcosGS", "soymarcos", "Marcos", "Gonzalez", "Silo", "30/12/1993", "mgs@mgs.mgs", "Akijl0987ujki6ygt54re", "fonts/users_folder_128.png", "Estudiante de ciencias de la salud", "Voluntariado en tiempo libre", "deL Martillo", "Alba de Tormes", 98709, "Salamanca", 908765123, "estudiante", "90878653g", "hombre");
		Usuarios usuario18=new Usuarios("BelenNC", "soybelen", "Belen", "Nevado", "casado", "01/10/1986", "bnc@bnc.bnc", "Ajkiu8ui9oilk9ikj7ujh", "fonts/users_folder_128.png", "Interactiva y apasionada por la quimica ", "Cine y teatro", "de la sierra", "Colombres", 34567, "Asturias", 908987675, "profesor", "34567890o", "mujer");
		Usuarios usuario19=new Usuarios("EliasGH", "soyelias", "Elias", "Gomez", "Herrero", "20/08/1990", "egh@egh.egh", "Bolkoilkoikjuujki9876", "fonts/users_folder_128.png", "Activo y curioso", "La teconologia", "MArques de las Vias", "Bollullos", 87987, "Huelva", 908787654, "estudiante", "98778765t", "hombre");
		Usuarios usuario20=new Usuarios("PedroCM", "soypedro", "Pedro", "Cuco", "Martin", "08/09/1990", "pcm@pcm.pcm", "Acvbhnjmkilko98765432", "fonts/users_folder_128.png", "Responsable y extrovertido", "Futbol", "de los Molinos", "Santander", 90870, "Cantabria", 908765432, "estudiante", "54667890i", "hombre");
		
		
		
		
		
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
		udao.guardarUsuario(usuario11);
		udao.guardarUsuario(usuario12);
		udao.guardarUsuario(usuario13);
		udao.guardarUsuario(usuario14);
		udao.guardarUsuario(usuario15);
		udao.guardarUsuario(usuario16);
		udao.guardarUsuario(usuario17);
		udao.guardarUsuario(usuario18);
		udao.guardarUsuario(usuario19);
		udao.guardarUsuario(usuario20);
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
			sesion.setAttribute("idUsuario",null);
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
					sesion.setAttribute("idUsuario",u.getId());
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
				String nickC = request.getParameter("nickClave");
				String claveNueva = request.getParameter("claveNueva");
				//String RclaveNueva = request.getParameter("RclaveNueva");
				if (claveActual != null) {
					Usuarios u=udao.actualizarClave(nickC, claveActual);
					u.setClave(claveNueva);
					try {
						udao.actualizarUsuario(u);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sesion.setAttribute("perfilRegistrado", u);
					pagina = "/perfilUsuario.jsp";
				}else{
					System.err.println("he petao");
				}
				
			
				break;
				
				
				
				
				
			case "editarPerfil":
			
				String nick = request.getParameter("nickActual");
				String nombre = request.getParameter("nombreActual");
				String apellido1 = request.getParameter("apellido1Actual");
				String apellido2 = request.getParameter("apellido2Actual");
				correo = request.getParameter("correoActual");
				String descripcion = request.getParameter("descripcionActual");
				String aficiones = request.getParameter("aficionesActual");
				
				Long idUsuario = (Long) sesion.getAttribute("idUsuario");
				Usuarios u = udao.buscarId(idUsuario);
				
				u.setNick(nick);
				u.setNombre(nombre);
				u.setApellido1(apellido1);
				u.setApellido2(apellido2);
				u.setCorreo(correo);
				u.setDescripcion(descripcion);
				u.setAficiones(aficiones);	
					try {
						udao.actualizarUsuario(u);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sesion.setAttribute("perfilRegistrado", u);
					sesion.setAttribute("estadoValidacion", u.getNick());
					pagina = "/perfilUsuario.jsp";
				
				
			
				break;
				
				
				
	
			case "crearRegistrado":
				
				nick = request.getParameter("nick");
				apellido1 = request.getParameter("apellido1");
				correo = request.getParameter("correoR");
				clave1 = request.getParameter("clave1");
				nombre = request.getParameter("nombre");
				apellido2 = request.getParameter("apellido2");
				String fechanac= request.getParameter("fechanac");
				String clave2 = request.getParameter("clave2");
				String rol="Alumno";
				//String aceptarterm = request.getParameter("aceptarterm");
				
				
				if (udao.buscarLogin(correo, clave1) == null) {
					Usuarios nuevoUsuario=new Usuarios(nick, clave1, nombre, apellido1, apellido2,correo, fechanac, rol);

					try {
						udao.guardarUsuario(nuevoUsuario);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					u =udao.buscarLogin(correo, clave1);
					sesion.setAttribute("usuarioReg", u);
					request.setAttribute("registrados", registrados);
					
			
					pagina = "/index.jsp";
					
				} /*else {
					System.err.println("entro mal");
					try {
						Usuarios nuevoUsuario=new Usuarios(nick, clave1, nombre, apellido1, apellido2,correo, fechanac, rol);
				

						udao.actualizarUsuario(nuevoUsuario);
						request.setAttribute("registrados", registrados);
						pagina = formularioReg;
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("ERROR");
					}
				}*/
				
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
