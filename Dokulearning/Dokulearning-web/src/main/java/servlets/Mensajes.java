package servlets;


	
	import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

	import javax.annotation.Resource;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

import jms.EscribirEnQueue;
	import es.uc3m.tiw.model.dominios.Mensaje;
import es.uc3m.tiw.model.dominios.Usuario;
import es.uc3m.tiw.model.daos.IPersona;
import es.uc3m.tiw.model.daos.MensajesDAO;
import es.uc3m.tiw.model.daos.PersonaDAO;
	
	
	/**
	* Servlet implementation class MensajesServlet
	*/
	@WebServlet("/mensajes")
	public class Mensajes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="demo-model")
	private EntityManager em;
	@Resource
	private UserTransaction ut;
	private IPersona dao;
	private MensajesDAO msgDao;
	@Inject
	private EscribirEnQueue colaMensajes;
	
	
	/**
	* @see Servlet#init(ServletConfig)
	*/
	public void init() throws ServletException {
	dao = new PersonaDAO(em, ut);
	msgDao = new MensajesDAO(em, ut);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	
	HttpSession sesion = request.getSession();
	Usuario u = (Usuario) sesion.getAttribute("usuario");
	List<Mensaje> mensajes = msgDao.findAllMessagesByUsuario(u);
	request.setAttribute("listaMensajes", mensajes);
	this.getServletContext().getRequestDispatcher("/listaMensajes.jsp").forward(request, response);
	
	
	
	
	}
	/**
	* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	String mensaje = request.getParameter("mensaje");
	Usuario from = dao.findById(Integer.valueOf(request.getParameter("from")));
	Usuario to = dao.findById(Integer.valueOf(request.getParameter("to")));
	Mensaje msg = new Mensaje(mensaje,from, to);
	
	
	
	colaMensajes.enviar(msg);
	
	this.getServletConfig().getServletContext().getRequestDispatcher("/login").forward(request, response);
	
	
	
	
	}
	
	}

