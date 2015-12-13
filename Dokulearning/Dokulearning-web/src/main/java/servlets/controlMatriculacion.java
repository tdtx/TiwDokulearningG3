package servlets;


import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

import dominio.usuarioMatriculacion;
import es.uc3m.tiw.model.daos.CursoDAO;
import es.uc3m.tiw.model.daos.MatriculadoDAO;
import es.uc3m.tiw.model.daos.UsuarioDAO;
import es.uc3m.tiw.model.dominios.Curso;
import es.uc3m.tiw.model.dominios.Matriculados;
import es.uc3m.tiw.model.dominios.Usuarios;



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
	@PersistenceContext(unitName="Dokulearning-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	UsuarioDAO udao;
	CursoDAO cdao;
	MatriculadoDAO mdao;

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

	
		udao=new UsuarioDAO(em, ut);
		cdao=new CursoDAO(em, ut);
		mdao=new MatriculadoDAO(em,ut);
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
		HttpSession sesion = request.getSession();
		String pagina = indexJSP;
		Long  idUsuario = (Long) sesion.getAttribute("idUsuario");
		String nombreCurso = null;
		switch (distribucionMatriculacion) {

		case "crearMatriculacion":
			
			double precio = Double.parseDouble(request.getParameter("precio"));
			int telefono = Integer.parseInt(request.getParameter("telefono"));
			String genero = request.getParameter("genero");
			String DNI = request.getParameter("DNI");
			String calle = request.getParameter("calle");			
			String localidad = request.getParameter("localidad");
			int codigopostal = Integer.parseInt(request.getParameter("codigopostal"));
			String provincia = request.getParameter("provincia");			
			Boolean aceptar = true;		
			 nombreCurso = request.getParameter("nombreCurso");
			
			if (idUsuario != null) {
				Usuarios u = udao.buscarId(idUsuario);
				Curso c = cdao.buscarTitulo(nombreCurso);
			
				
				u.setDni(DNI);
				u.setGenero(genero);
				u.setTelefono(telefono);
				u.setCalle(calle);
				u.setLocalidad(localidad);
				u.setCodigoPostal(codigopostal);
				u.setProvincia(provincia);
				Matriculados nuevoMatriculado = new Matriculados(nombreCurso, u.getNick(), null, precio, 0);
				try {
					mdao.guardarMatriculado(nuevoMatriculado);
					udao.actualizarUsuario(u);
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				sesion.setAttribute("perfilCurso", c);
					pagina = "/datosPago.jsp";

	
			}else {
				pagina = "/clienteNoValidado.jsp";
			}

			break;
		case "pagar":
			nombreCurso = request.getParameter("nombreCurso");
			String tarjeta = request.getParameter("tarjeta");
			Usuarios u = udao.buscarId(idUsuario);
			Curso c = cdao.buscarTitulo(nombreCurso);

			u.setTarjeta(tarjeta);;
			try {
				udao.actualizarUsuario(u);
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			sesion.setAttribute("perfilCurso", c);
			sesion.setAttribute("perfilusu", u);
				pagina = "/factura.jsp";
			break;
			
		default:

			break;

		}
		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);

	}

/*	private void registrarMatriculacion(String telefono, String calle,
			String localidad, String codigopostal, String provincia,
			String fechanacimiento, String dNI, Boolean aceptar, String genero,
			String formPago, String precio, String nombreCurso) {
		// TODO Auto-generated method stub

		usuarioMatriculacion um1 = new usuarioMatriculacion(telefono, calle,
				localidad, codigopostal, provincia, fechanacimiento, dNI,
				aceptar, "mujer", "transferencia" );

		matriculados.add(um1);
	}*/

	/*private void editarUsuarioMatriculacion(String telefono, String calle,
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

	}*/

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
