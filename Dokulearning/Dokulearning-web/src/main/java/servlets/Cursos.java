
package servlets;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

import dominio.FormularioCurso;
import es.uc3m.tiw.model.daos.CursoDAO;
import es.uc3m.tiw.model.daos.MatriculadoDAO;
import es.uc3m.tiw.model.daos.UsuarioDAO;
import es.uc3m.tiw.model.dominios.Curso;
import es.uc3m.tiw.model.dominios.Matriculados;
import es.uc3m.tiw.model.dominios.Usuarios;



/**
 * Servlet implementation class Cursos
 */
@WebServlet("/Cursos")
public class Cursos extends HttpServlet {


	private ArrayList<FormularioCurso> cursos;
	private static final long serialVersionUID = 1L;
	public FormularioCurso cursoOferta;
	@PersistenceContext(unitName="Dokulearning-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	UsuarioDAO udao;
	CursoDAO cdao;
	MatriculadoDAO mdao;
	/**
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	@Override
	public void init() throws ServletException {

		super.init();
		FormularioCurso curso1 = new FormularioCurso("Programacion en GLPK",
				"1234", "descripcion breve", "Tema1 Tema2 Tema3",
				"Aitor Tilla", "Heuristica y optimizacion",
				"imagenes/addressbook_add_128.png", "Alta", "01-11-2015",
				"01-12-2015", "02-12-2015", "12");
		FormularioCurso curso2 = new FormularioCurso("Programacion en C",
				"2334", "descripcion breve", "Tema1 Tema2 Tema3",
				"Aitor Menta", "Programacion",
				"imagenes/addressbook_add_128.png", "Alta", "01-11-2015",
				"01-12-2015", "02-12-2015", "12");

		cursos = new ArrayList<FormularioCurso>();
		cursos.add(curso1);
		cursos.add(curso2);
		udao=new UsuarioDAO(em, ut);
		cdao=new CursoDAO(em, ut);
		mdao=new MatriculadoDAO(em, ut);
	}
	
	public Cursos() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		List cursos = null;
		String accion = request.getParameter("accion");
		String estado = request.getParameter("estado");
		Long idUsuario = (Long) sesion.getAttribute("idUsuario");
		System.err.println(accion);
		String pagina = "/index.jsp";

		
		
		if(accion.equals("crearCurso")){
			Usuarios u =udao.buscarNick(estado); 
			
			sesion.setAttribute("cursos", u);
			pagina = "/formularioCurso.jsp";
			
		}
		
		if (accion != null) {
			System.err.println("super5"+accion);
			Curso u = cdao.buscarTitulo(accion);
			if( u!= null){
	
			sesion.setAttribute("perfilCurso", u);
			pagina = "/resumenCurso.jsp";
			System.err.println("entroooo");
			if (estado != null) {
				if (estado.equals("matricularse") && idUsuario != null) {
					sesion.setAttribute("perfilCurso", u);
					pagina = "/matriculacionDeCurso.jsp";
				}else if(estado.equals("Profe")){
					sesion.setAttribute("perfilCurso", u);
					sesion.setAttribute("profesor", u.getUsuario());
					pagina = "/resumenCurso.jsp";
				}else{
					pagina = "/clienteNoValidado.jsp";
				}
			}
		}else{	System.err.println("malo");}
		}



		if (accion.equals("cursos")) {
			try {
				cursos = cdao.buscarCursos();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("cursos", cursos);
			pagina = "/cursoOferta.jsp";

		}
		if (accion.equals("destacados")) {
			try {
				cursos =  cdao.buscarDestacados("Si");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("cursos", cursos);
			pagina = "/cursoDestacados.jsp";
		}
		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);
	}
	private FormularioCurso comprobarNom(String nom) {
		FormularioCurso u = null;
		for (FormularioCurso f : cursos) {
			if (nom.equals(f.getNom())) {
				u = f;
				break;
			}
		}
		return u;
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		List cursos = null;
		List matriculados = null;
        String pagina = "/index.jsp";
		String action = request.getParameter("action");
		HttpSession sesion = request.getSession();
		if (action.equals("rellenarFormulario")) {
			String titulo= request.getParameter("nom");
			String descripcion= request.getParameter("descripcion");
			String temario= request.getParameter("temario");
			String imagen= "imagenes/addressbook_add_128.png";
			double precio= Double.parseDouble(request.getParameter("precio"));
			String horas= request.getParameter("horas");
			String profesor= request.getParameter("profesor");
			String fInicio= request.getParameter("fInicio");
			String fFin= request.getParameter("fFin");
			String dificultad= request.getParameter("dificultad");
	        String Rol = "Profesor";
	        
	        Curso cn = new Curso(titulo, descripcion, horas, temario, profesor, dificultad, "No", "Magistrales", "No", "No", precio, "No", imagen, fFin, 0, fInicio, 0);
	        try {
				cdao.guardarCurso(cn);
				Matriculados mn = new Matriculados(cn.getTitulo(), cn.getUsuario(), null, cn.getPrecio(), 0);
				Usuarios un = udao.buscarNick(cn.getUsuario());
				un.setRol(Rol);
				udao.actualizarUsuario(un);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        pagina = "/index.jsp";
	        
		}
		if (action != null && !action.equals("rellenarFormulario")) {
			long idCEdit = Integer.parseInt(request.getParameter("idC"));
			String tituloCEdit= request.getParameter("tituloC");
	        String descripcionCEdit = request.getParameter("descripcionC");
	        String nHorasCEdit= request.getParameter("horasC");
	        String temariosCEdit= request.getParameter("temarioC");
	        String usuarioCEdit= request.getParameter("usuarioC");
	        String nivelCEdit= request.getParameter("nivelC");
	        String certificadoCEdit= request.getParameter("certificadoC");   
	        String categoriaCEdit= request.getParameter("categoriaC");
	        String destacadoCEdit= request.getParameter("destacadoC");      
	        String validacionCEdit = request.getParameter("validacionC");
	        double precioCEdit= Double.parseDouble(request.getParameter("precioC"));
	        String tOfertaCEdit= request.getParameter("tipoOfertaC");
	        String fechaFinCEdit= request.getParameter("fechaCaducidadC"); 
	        String fechaInicioCEdit= request.getParameter("fechaInicioC"); 
	        int contador = Integer.parseInt(request.getParameter("contadorC"));
	        contador = 0;

	        String img = "imagenes/addressbook_add_128.png";

	        
	        
	        try {
			    	Curso c = cdao.buscarCurso(idCEdit);
			    	matriculados = mdao.buscarMatriculados(c.getTitulo());
			    	for (int j = 0; j < matriculados.size(); j++) {
						Matriculados m = (Matriculados) matriculados.get(j);
						m.setCurso(tituloCEdit);
						m.setPrecio_final(precioCEdit);
						mdao.actualizarMatriculado(m);
					}
			    	
			    	contador = matriculados.size();
			    	if (c!= null) {
						c.setTitulo(tituloCEdit);
						c.setDescripcion(descripcionCEdit);
						c.setHoras(nHorasCEdit);
						c.setTemario(temariosCEdit);
						c.setUsuario(usuarioCEdit);
						c.setNivel(nivelCEdit);
						c.setCertificado(certificadoCEdit);
						c.setCategoria(categoriaCEdit);
						c.setDestacado(destacadoCEdit);
						c.setValidacion(validacionCEdit);
						c.setPrecio(precioCEdit);
						c.setTipoOferta(tOfertaCEdit);
						c.setFechaCaducidad(fechaFinCEdit);
						c.setDescuentoCupon(0);
						c.setFechaInicio(fechaInicioCEdit);
						c.setIdImagen(img);					
						c.setContador(contador);	
						
						cdao.actualizarCurso(c);			
					}
			    	cursos = cdao.buscarCursos();
			    	matriculados = mdao.buscarMatriculados();
			    	Usuarios u=udao.buscarNick(action);

			    	udao.actualizarUsuario(u);
					try {
						cursos = cdao.buscarProfesor(u.getNick());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					for (int i = 0; i < cursos.size(); i++) {
						Curso cm = (Curso) cursos.get(i);
						try {
							matriculados = mdao.buscarCurso(cm.getTitulo());
						for (int j = 0; j < matriculados.size(); j++) {
							 Matriculados m = (Matriculados) matriculados.get(j);

						}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					request.setAttribute("matriculados", matriculados);
			        pagina = "/misCursos.jsp";
			    } catch (Exception e) {
			        // TODO: handle exception
			        e.printStackTrace();
			        System.out.println("**Editar Registrado** Error al actualizar el registrado***");
			    }		
			}
		this.getServletContext().getRequestDispatcher(pagina)
		.forward(request, response);

	}
}
