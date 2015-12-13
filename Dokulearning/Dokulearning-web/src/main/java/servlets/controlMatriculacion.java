package servlets;


import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dominio.usuarioMatriculacion;



/**
 * Servlet implementation class controlMatriculacion
 */
@WebServlet("/controlMatriculacion")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50, location = "/")
// 50MB
public class controlMatriculacion extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ArrayList<usuarioMatriculacion> matriculados;
	private static final String matriculacionDeCursoJSP = "/matriculacionDeCurso.jsp";
	private static final String indexJSP = "/index.jsp";


	registroWeb rw = new registroWeb();
	/**	@PersistenceContext(unitName="Administracion-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	UsuarioDAO udao;

	 * @see HttpServlet#HttpServlet()
	 */
	public controlMatriculacion() {
		super();

		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		usuarioMatriculacion um1 = new usuarioMatriculacion("123123123",
				"calle1", "madrid", "12345", "madrid", "holafechamal",
				"123456789", true, "mujer", "transferencia");
		usuarioMatriculacion um2 = new usuarioMatriculacion("321321321",
				"calle2", "madrid", "12345", "madrid", "holafechamal",
				"123456789", true, "mujer", "paypal");

		matriculados = new ArrayList<usuarioMatriculacion>();
		matriculados.add(um1);
		matriculados.add(um2);

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion = request.getParameter("accion");
		String pagina = indexJSP;
		if (accion != null && accion.equals("perfil")) {
            request.setAttribute("matriculados", matriculados);
            pagina = matriculacionDeCursoJSP;
        }
        if (accion != null && accion.equals("eliminarMatricula")) {
            String correo = request.getParameter("correo");
            eliminarMatriculado(correo);
            request.setAttribute("matriculados", matriculados);
            pagina = matriculacionDeCursoJSP;
        }
       
        
		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);
	}

	private void eliminarMatriculado(String correo) {
		int x = 0;
		for (usuarioMatriculacion uM : matriculados) {
			if (correo.equals(uM.getCorreo())) {
				matriculados.remove(x);
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

		String distribucionMatriculacion = request
				.getParameter("distribucionMatriculacion");
		HttpSession sesion = request.getSession(true);
		String pagina = indexJSP;

		switch (distribucionMatriculacion) {

		case "crearMatriculacion":
			
			String telefono = request.getParameter("telefono");
			String calle = request.getParameter("calle");
			String localidad = request.getParameter("localidad");
			String codigopostal = request.getParameter("codigopostal");
			String provincia = request.getParameter("provincia");
			String fechanacimiento = request.getParameter("fechaNacimiento");
			String DNI = request.getParameter("DNI");
			Boolean aceptar = true;
			String genero = request.getParameter("genero");
			String formaPago = request.getParameter("formaPago");
			String precio = request.getParameter("precio");
			String nombreCurso = request.getParameter("nombreCurso");

			if (comprobarUsuario(telefono)!=null) {
				registrarMatriculacion(telefono, calle, localidad,
						codigopostal, provincia, fechanacimiento, DNI, aceptar,
						genero, formaPago, precio, nombreCurso);

				usuarioMatriculacion u = comprobarUsuario(telefono);
				sesion.setAttribute("usuarioMat", u);
				sesion.setAttribute("acceso", telefono);

				request.setAttribute("matriculados", matriculados);

			} else {

				try {
					editarUsuarioMatriculacion(telefono, calle, localidad,
							codigopostal, provincia, fechanacimiento, DNI,
							aceptar, genero, formaPago );
					request.setAttribute("matriculados", matriculados);
					pagina = matriculacionDeCursoJSP;
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("error");
				}
			}

			break;

		default:

			break;

		}
		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher("perfilUsuario.jsp")
				.forward(request, response);

	}

	private void registrarMatriculacion(String telefono, String calle,
			String localidad, String codigopostal, String provincia,
			String fechanacimiento, String dNI, Boolean aceptar, String genero,
			String formPago, String precio, String nombreCurso) {
		// TODO Auto-generated method stub

		usuarioMatriculacion um1 = new usuarioMatriculacion(telefono, calle,
				localidad, codigopostal, provincia, fechanacimiento, dNI,
				aceptar, "mujer", "transferencia" );

		matriculados.add(um1);
	}

	private void editarUsuarioMatriculacion(String telefono, String calle,
			String localidad, String codigopostal, String provincia,
			String fechanacimiento, String dNI, boolean aceptar, String genero,
			String formaPago) {
		for (usuarioMatriculacion um : matriculados) {
			if (telefono.equals(um.getTelefono())) {
				um.setTelefono(telefono);
				um.setCalle(calle);
				um.setLocalidad(localidad);
				um.setCodigoPostal(codigopostal);
				um.setProvincia(provincia);
				um.setFechaNacimiento(fechanacimiento);
				um.setDNI(dNI);
				um.setAceptar(aceptar);
				um.setGenero(genero);
				um.setFormaPago(formaPago);
				break;
			}
		}
		// TODO Auto-generated method stub

	}

	private usuarioMatriculacion comprobarUsuario(String telefono) {
		usuarioMatriculacion u = null;
		for (usuarioMatriculacion usuarioum : matriculados) {
			if (telefono.equals(usuarioum.getTelefono())) {
				u = usuarioum;
				break;
			}
		}
		return u;
	}

}
