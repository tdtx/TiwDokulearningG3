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
import es.uc3m.tiw.model.daos.CreadorCursoDAO;
import es.uc3m.tiw.model.daos.CursoDAO;
import es.uc3m.tiw.model.daos.ImagenDAO;
import es.uc3m.tiw.model.daos.LeccionDAO;
import es.uc3m.tiw.model.daos.MatriculadoDAO;
import es.uc3m.tiw.model.daos.PruebaDAO;
import es.uc3m.tiw.model.daos.ResultadoPruebaDAO;
import es.uc3m.tiw.model.daos.SeccionDAO;
import es.uc3m.tiw.model.daos.UsuarioDAO;
import es.uc3m.tiw.model.dominios.CreadorCurso;
import es.uc3m.tiw.model.dominios.Curso;
import es.uc3m.tiw.model.dominios.Imagenes;
import es.uc3m.tiw.model.dominios.Leccion;
import es.uc3m.tiw.model.dominios.Matriculados;
import es.uc3m.tiw.model.dominios.Pruebas;
import es.uc3m.tiw.model.dominios.ResultadosPruebas;
import es.uc3m.tiw.model.dominios.Seccion;
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
	CursoDAO cdao;
	ImagenDAO idao;
	SeccionDAO sdao;
	LeccionDAO ldao;
	PruebaDAO pdao;
	ResultadoPruebaDAO rpdao;
	CreadorCursoDAO ccdao;
	MatriculadoDAO mdao;
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

		
		
		
		//usuarios con perfil matriculados
		Usuarios usuario11=new Usuarios("LauLV", "clavelau", "Laura", "Lopez", "Vazquez", "20/08/1991", "llv@llv.llv", "Ayhju9876ujki8ujkujki", "fonts/users_folder_128.png", "Estudiante de cuarto curso de ADE", "La ciencia ficcion", "De las Heras", "Madrid", 28017, "Madrid", 786654321, "Estudiante", "89776546y", "Mujer");   
		Usuarios usuario12=new Usuarios("LidiRG", "clavelidi", "Lidia", "Rodriguez", "Garcia", "25/09/1992", "lrg@lrg.lrg", "Bikj7kilo098u7y6t5r4e", "fonts/users_folder_128.png", "Profesora de ciencias tecnologicas", "La enseñanza y el deporte", "De la Vega", "Las Rozas", 25089, "Madrid", 987654789, "Profesor", "87698423z", "Mujer");
		Usuarios usuario13=new Usuarios("RaulFJ", "soyraul", "Raul", "Fernandez", "Jimenez", "04/12/1985", "rfj@rfj.rfj", "Bikju7865tgh645rt3ew2", "fonts/users_folder_128.png", "Entusiasmado por el mundo sanitario", "El arte y viajar", "San Ambrosio", "Colmenarejo", 45367, "Madrid", 453567890, "Profesor", "58754123p", "Hombre");
		Usuarios usuario14=new Usuarios("MartinMF", "soymartin", "Martin", "Marquez", "Frias", "01/06/1978", "mmf@mmf.mmf", "Blkoi9oi87uy8ujhy6tgh", "fonts/users_folder_128.png", "Persona sociable y trabajadora", "El mundo del motor", "Del Abeto", "El Molar", 98765, "Madrid", 987654289, "Profesor", "98712385t", "Hombre");
		Usuarios usuario15=new Usuarios("AliPM", "soyali", "Alicia", "Pais", "Maravillas", "27/12/1992", "apm@apm.apm", "Bjkol0987ujhy6tgf4rfd", "fonts/users_folder_128.png", "Entusiasta y amable", "El mundo de la belleza", "Perez Herrera", "Leganes", 98765, "Madrid", 980765190, "Estudiante", "90876123r", "Mujer");
		Usuarios usuario16=new Usuarios("AlbaMP", "soyalba", "Alba", "Marin", "Palacios", "30/08/1970", "amp@amp.amp", "Aikjl0987ujhy5645rfgt", "fonts/users_folder_128.png", "Profesora proactiva y sociable", "El deporte y la musica", "Del Globo", "Getafe", 98765, "Madrid", 786542134, "Profesor", "98765398u", "Mujer");
		Usuarios usuario17=new Usuarios("MarcosGS", "soymarcos", "Marcos", "Gonzalez", "Silo", "30/12/1993", "mgs@mgs.mgs", "Akijl0987ujki6ygt54re", "fonts/users_folder_128.png", "Estudiante de ciencias de la salud", "Voluntariado en tiempo libre", "DeL Martillo", "Alba de Tormes", 98709, "Salamanca", 908765123, "Estudiante", "90878653g", "Hombre");
		Usuarios usuario18=new Usuarios("BelenNC", "soybelen", "Belen", "Nevado", "casado", "01/10/1986", "bnc@bnc.bnc", "Ajkiu8ui9oilk9ikj7ujh", "fonts/users_folder_128.png", "Interactiva y apasionada por la quimica ", "Cine y teatro", "De la sierra", "Colombres", 34567, "Asturias", 908987675, "Profesor", "34567890o", "Mujer");
		Usuarios usuario19=new Usuarios("EliasGH", "soyelias", "Elias", "Gomez", "Herrero", "20/08/1990", "egh@egh.egh", "Bolkoilkoikjuujki9876", "fonts/users_folder_128.png", "Activo y curioso", "La teconologia", "Marques de las Vias", "Bollullos", 87987, "Huelva", 908787654, "Estudiante", "98778765t", "Hombre");
		Usuarios usuario20=new Usuarios("PedroCM", "soypedro", "Pedro", "Cuco", "Martin", "08/09/1990", "pcm@pcm.pcm", "Acvbhnjmkilko98765432", "fonts/users_folder_128.png", "Responsable y extrovertido", "Futbol", "De los Molinos", "Santander", 90870, "Cantabria", 908765432, "Estudiante", "54667890i", "Hombre");
		
		
	
		
		
		//Cursos
		Curso curso1 = new Curso( "Estadistica", "Curso de estadistica", "0077","Tema1 tema2 tema3 tema4", "123456789", "Medio","Certificado", "Matematicas", "No","A eliminar", 34, "No", "imagenes/addressbook_add_128.png", "23/12/15", 10,"01/12/15");
		Curso curso2 = new Curso("Fisica", "Curso de fisica", "0097","Tema1 tema2 tema3 tema4 tema5", "223456789", "Medio","Certificado", "Fisica", "No","Pendiente", 23, "Si", "imagenes/addressbook_add_128.png", "23/12/15", 20, "01/12/15");
		Curso curso3 = new Curso("Ingenieria del Software", "Curso de Ingenieria del Software", "0059","Tema1 tema2 tema3 tema4", "323456789", "Medio","Certificado", "Informatica", "No","Estado", 34, "No", "imagenes/addressbook_add_128.png", "23/12/15", 20, "01/12/15");
		Curso curso4 = new Curso("Programacion", "Curso de programacion", "0077","Tema1 tema2 tema3 tema4", "423456789", "Medio","Certificado", "Informatica", "Si","Validado", 56, "No", "imagenes/addressbook_add_128.png", "23/12/15", 20, "01/12/15");
		Curso curso5 = new Curso("Literatura", "Curso de literatura", "0077","Tema1 tema2 tema3 tema4", "523456789", "Medio","Certificado", "Lengua y literatura", "No","Validado", 32, "Si", "imagenes/addressbook_add_128.png", "23/12/15", 10, "01/12/15");
		Curso curso6 = new Curso("Ingles", "Curso de ingles", "0077","Tema1 tema2 tema3 tema4", "623456789", "Medio","Certificado", "Idioma", "No","Validado", 73, "No", "imagenes/addressbook_add_128.png", "23/12/15", 0, "01/12/15");
		Curso curso7 = new Curso("Frances", "Curso de Frances", "0077","Tema1 tema2 tema3 tema4", "723456789", "Medio","Certificado", "Idioma", "Si","Validado", 42, "No", "imagenes/addressbook_add_128.png", "23/12/15", 10, "01/12/15");
		Curso curso8 = new Curso( "Redes de computadoras", "Curso de redes", "0077","Tema1 tema2 tema3 tema4", "823456789", "Medio","Certificado", "Informatica", "No","Validado", 16, "Si", "imagenes/addressbook_add_128.png", "23/12/15", 0, "01/12/15");
		Curso curso9 = new Curso("Interfaces de usuario", "Curso de interfaces", "0077","Tema1 tema2 tema3 tema4", "923456789", "Medio","Certificado", "Informatica", "No","Validado", 77, "Si", "imagenes/addressbook_add_128.png", "23/12/15", 0, "01/12/15");
		Curso curso10 = new Curso( "Arquitectura de computadores", "Curso de arcos", "0077","Tema1 tema2 tema3 tema4", "023456789", "Medio","Certificado", "Informatica", "Si","Validado", 45, "Si", "imagenes/addressbook_add_128.png", "23/12/15", 10, "01/12/15");
		Curso curso11 = new Curso("Italiano", "Curso de italiano", "0077","Tema1 tema2 tema3 tema4", "133456789", "Medio","Certificado", "Idiomas", "No","Validado", 35, "No", "imagenes/addressbook_add_128.png", "23/12/15", 20, "01/12/15");
		Curso curso12 = new Curso("Chino", "Curso de chino", "0077","Tema1 tema2 tema3 tema4", "143456789", "Medio","Certificado", "Idiomas", "Si","Validado", 43, "No", "imagenes/addressbook_add_128.png", "23/12/15", 20, "01/12/15");
		Curso curso13 = new Curso("Criptografia", "Curso de criptografia", "0077","Tema1 tema2 tema3 tema4", "153456789", "Medio","Certificado", "Informatica", "No","Validado", 55, "No", "imagenes/addressbook_add_128.png", "23/12/15", 20, "01/12/15");
		Curso curso14 = new Curso("SSOO", "Curso de SSOO", "0077","Tema1 tema2 tema3 tema4", "163456789", "Medio","Certificado", "Informatica", "No","Validado", 73, "Si", "imagenes/addressbook_add_128.png", "23/12/15", 10,"01/12/15");
		Curso curso15 = new Curso("Ficheros", "Curso de ficheros", "0077","Tema1 tema2 tema3 tema4", "173456789", "Medio","Certificado", "Informatica", "No","Validado", 23, "Si", "imagenes/addressbook_add_128.png", "23/12/15", 10, "01/12/15");
		Curso curso16 = new Curso("ADE", "Curso de ADE", "0077","Tema1 tema2 tema3 tema4", "183456789", "Medio","Certificado", "Empresa", "Si","Validado", 43, "No", "imagenes/addressbook_add_128.png", "23/12/15", 10, "01/12/15");
		Curso curso17 = new Curso("Algebra Lineal", "Curso de Algebra", "0077","Tema1 tema2 tema3 tema4", "193456789", "Medio","Certificado", "Matematicas", "No","Validado", 36, "Si", "imagenes/addressbook_add_128.png", "23/12/15",20, "01/12/15");
		Curso curso18 = new Curso("Calculo", "Curso de calculo", "0077","Tema1 tema2 tema3 tema4", "103456789", "Medio","Certificado", "Matematicas", "Si","Validado", 85, "Si", "imagenes/addressbook_add_128.png", "23/12/15", 20, "01/12/15");
		Curso curso19 = new Curso("Calculo Diferencial", "Curso de calculo diferencial", "0077","Tema1 tema2 tema3 tema4", "113456789", "Medio","Certificado", "Matematicas", "No","Validado", 12, "No", "imagenes/addressbook_add_128.png", "23/12/15", 20, "01/12/15");
		Curso curso20 = new Curso("Matematica Discreta", "Curso de matematica discreta", "0077","Tema1 tema2 tema3 tema4", "124456789", "Medio","Certificado", "Matematicas", "No","Validado", 37, "No", "imagenes/addressbook_add_128.png", "23/12/15", 10, "01/12/15");
				
		
		
		//matriculados
				Matriculados matriculado1=new Matriculados(curso1, usuario11, "cupon1", 128.90, 2.8);
				Matriculados matriculado2=new Matriculados(curso2, usuario12, "cupon2", 128.90, 2.8 );
				Matriculados matriculado3=new Matriculados(curso3, usuario13, "cupon3", 128.90, 2.8);
				Matriculados matriculado4=new Matriculados(curso4, usuario14, "cupon4", 128.90, 2.8);
				Matriculados matriculado5=new Matriculados(curso5, usuario15, "cupon5", 128.90, 2.8);
				Matriculados matriculado6=new Matriculados(curso6, usuario16, "cupon6", 128.90, 2.8);
				Matriculados matriculado7=new Matriculados(curso7, usuario17, "cupon7", 128.90, 2.8);
				Matriculados matriculado8=new Matriculados(curso8, usuario18, "cupon8", 128.90, 2.8);
				Matriculados matriculado9=new Matriculados(curso9, usuario19, "cupon9", 128.90, 2.8);
				Matriculados matriculado10=new Matriculados(curso10, usuario20, "cupon10", 128.90, 2.8);
				Matriculados matriculado11=new Matriculados(curso11, usuario11, "cupon11", 128.90, 2.8);
				Matriculados matriculado12=new Matriculados(curso12, usuario12, "cupon12", 128.90, 2.8);
				Matriculados matriculado13=new Matriculados(curso13, usuario13, "cupon13", 128.90, 2.8);
				Matriculados matriculado14=new Matriculados(curso14, usuario14, "cupon14", 128.90, 2.8);
				Matriculados matriculado15=new Matriculados(curso15,usuario15 , "cupon15", 128.90, 2.8);
				Matriculados matriculado16=new Matriculados(curso16,usuario16 , "cupon16", 128.90, 2.8);
				Matriculados matriculado17=new Matriculados(curso17, usuario17, "cupon17", 128.90, 2.8);
				Matriculados matriculado18=new Matriculados(curso18, usuario18, "cupon18", 128.90, 2.8);
				Matriculados matriculado19=new Matriculados(curso19, usuario19, "cupon19", 128.90, 2.8);
				Matriculados matriculado20=new Matriculados(curso20, usuario20, "cupon20", 128.90, 2.8);
				
				
				
		//imagenes
		Imagenes imagen1 = new Imagenes("fonts/users_folder_128.png");
		Imagenes imagen2 = new Imagenes("imagenes/addressbook_add_128.png");
		
		//secciones
		Seccion seccion1 = new Seccion("Electricidad fisica");
		Seccion seccion2 = new Seccion("Fuerzas magneticas");
		Seccion seccion3 = new Seccion("Italiano practico");
		Seccion seccion4 = new Seccion("Teoria francesa");
		Seccion seccion5 = new Seccion("Teoria italiana");
		Seccion seccion6 = new Seccion("Metodos en java");
		Seccion seccion7 = new Seccion("Teoria de grafos");
		Seccion seccion8 = new Seccion("El Modelo relacional");
		Seccion seccion9 = new Seccion("Historia del chino");
		Seccion seccion10 = new Seccion("Integrales");
		Seccion seccion11 = new Seccion("Derivadas");
		Seccion seccion12 = new Seccion("Sistemas operativos monoliticos");
		Seccion seccion13 = new Seccion("Ataques criptograficos");
		Seccion seccion14 = new Seccion("Historia de España");
		Seccion seccion15 = new Seccion("El arte moderno");
		Seccion seccion16 = new Seccion("Literatura francesa");
		Seccion seccion17 = new Seccion("Clases y objetos en java");
		Seccion seccion18 = new Seccion("Ejercicios practicos de C++");
		Seccion seccion19 = new Seccion("Combinatoria basica");
		Seccion seccion20 = new Seccion("Combinatoria avanzada");
		
		
		//Lecciones  
		Leccion leccion1=new Leccion("idcurso1","idseccion1","Introduccion a la electricidad");
		Leccion leccion2=new Leccion("idcurso2","idseccion2","Introduccion al electromagnetismo");
		Leccion leccion3=new Leccion("idcurso3","idseccion3","La economia clasica");
		Leccion leccion4=new Leccion("idcurso4","idseccion4","Indicadores macroeconomicos");
		Leccion leccion5=new Leccion("idcurso5","idseccion5","Vocabulario italiano de negocios");
		Leccion leccion6=new Leccion("idcurso6","idseccion6","Los metodos get y post");
		Leccion leccion7=new Leccion("idcurso7","idseccion7","Memoria RAM");
		Leccion leccion8=new Leccion("idcurso8","idseccion8","Memoria Cache");
		Leccion leccion9=new Leccion("idcurso9","idseccion9","Memoria Virtual");
		Leccion leccion10=new Leccion("idcurso10","idseccion10","Grafos eulerianos");
		Leccion leccion11=new Leccion("idcurso11","idseccion11","Grafos hamiltonianos");
		Leccion leccion12=new Leccion("idcurso12","idseccion12","Museos en el mundo moderno");
		Leccion leccion13=new Leccion("idcurso13","idseccion13","La posesia moderna");
		Leccion leccion14=new Leccion("idcurso14","idseccion14","virus informaticos");
		Leccion leccion15=new Leccion("idcurso15","idseccion15","Campos electricos");
		Leccion leccion16=new Leccion("idcurso16","idseccion16","Campos magneticos");
		Leccion leccion17=new Leccion("idcurso17","idseccion17","Gauss");
		Leccion leccion18=new Leccion("idcurso18","idseccion18","Verbos italianos");
		Leccion leccion19=new Leccion("idcurso19","idseccion19","Vocabulario chino de ocio");
		Leccion leccion20=new Leccion("idcurso20","idseccion20","teorema de Euler");
		
		//pruebas 
		Pruebas prueba1=new Pruebas ("idcursoo1","Examen de combinatoria basica");
		Pruebas prueba2=new Pruebas ("idcursoo1","Examen de combinatoria avanzada");
		Pruebas prueba3=new Pruebas ("idcursoo3","Examen de redes");
		Pruebas prueba4=new Pruebas ("idcursoo4","Examen de grafos eulerianos y hamiltonianos");
		Pruebas prueba5=new Pruebas ("idcursoo5","Examen de algebra lineal");
		Pruebas prueba6=new Pruebas ("idcursoo6","Examen de vocabulario chino");
		Pruebas prueba7=new Pruebas ("idcursoo7","Examen de vocabulario italiano");
		Pruebas prueba8=new Pruebas ("idcursoo8","Examen practico de chino");
		Pruebas prueba9=new Pruebas ("idcursoo9","Examen practico de italiano");
		Pruebas prueba10=new Pruebas ("idcursoo10","Examen de electricidad fisica");
		Pruebas prueba11=new Pruebas ("idcursoo11","Examen de ficheros");
		Pruebas prueba12=new Pruebas ("idcursoo12","Examen de historia");
		Pruebas prueba13=new Pruebas ("idcursoo13","Examen de calculo diferencial aplicado");
		Pruebas prueba14=new Pruebas ("idcursoo14","Examen de ADE");
		Pruebas prueba15=new Pruebas ("idcursoo15","Exmamen de estadisitca");
		Pruebas prueba16=new Pruebas ("idcursoo16","Examen de virus informaticos");
		Pruebas prueba17=new Pruebas ("idcursoo17","Examen de ejercicios de memoria cache");
		Pruebas prueba18=new Pruebas ("idcursoo18","Examen teorico de memoria cache");
		Pruebas prueba19=new Pruebas ("idcursoo19","Examen de ejercicios de memoria virtual");
		Pruebas prueba20=new Pruebas ("idcursoo20","Examen teorico de memoria virtual");
		
		//resultados pruebas
		ResultadosPruebas resultado1=new ResultadosPruebas("idprueba1", "idmatricula1", 3.0, "Suspenso");
		ResultadosPruebas resultado2=new ResultadosPruebas("idprueba2", "idmatricula2", 3.98, "Suspenso");
		ResultadosPruebas resultado3=new ResultadosPruebas("idprueba3", "idmatricula3", 4.5, "Suspenso");
		ResultadosPruebas resultado4=new ResultadosPruebas("idprueba4", "idmatricula4", 5.1, "Aprobado");
		ResultadosPruebas resultado5=new ResultadosPruebas("idprueba5", "idmatricula5", 9.45, "Sobresaliente");
		ResultadosPruebas resultado6=new ResultadosPruebas("idprueba6", "idmatricula6", 3.75, "Suspenso");
		ResultadosPruebas resultado7=new ResultadosPruebas("idprueba7", "idmatricula7", 3.9, "Suspenso");
		ResultadosPruebas resultado8=new ResultadosPruebas("idprueba8", "idmatricula8", 8.0, "Notable");
		ResultadosPruebas resultado9=new ResultadosPruebas("idprueba9", "idmatricula9", 7.7, "Notable");
		ResultadosPruebas resultado10=new ResultadosPruebas("idprueba10", "idmatricula10", 6.75, "Bien");
		ResultadosPruebas resultado11=new ResultadosPruebas("idprueba11", "idmatricula11", 1.95, "Suspenso");
		ResultadosPruebas resultado12=new ResultadosPruebas("idprueba12", "idmatricula12", 8.9, "Notable");
		ResultadosPruebas resultado13=new ResultadosPruebas("idprueba13", "idmatricula13", 9.25, "Sobresaliente");
		ResultadosPruebas resultado14=new ResultadosPruebas("idprueba14", "idmatricula14", 2.6, "Suspenso");
		ResultadosPruebas resultado15=new ResultadosPruebas("idprueba15", "idmatricula15", 7.5, "Notable");
		ResultadosPruebas resultado16=new ResultadosPruebas("idprueba16", "idmatricula16", 8.3, "Notable");
		ResultadosPruebas resultado17=new ResultadosPruebas("idprueba17", "idmatricula17", 4.5, "Suspenso");
		ResultadosPruebas resultado18=new ResultadosPruebas("idprueba18", "idmatricula18", 6.75, "Bien");
		ResultadosPruebas resultado19=new ResultadosPruebas("idprueba19", "idmatricula19", 6.01, "Bien");
		ResultadosPruebas resultado20=new ResultadosPruebas("idprueba20", "idmatricula20", 3.9, "uspenso");
		
		//profesores
		CreadorCurso profesor1=new CreadorCurso("Estadistica","LidiRG",125.8);
		CreadorCurso profesor2=new CreadorCurso("Fisica","LidiRG",130.2);
		CreadorCurso profesor3=new CreadorCurso("Ingenieria del Software","LidiRG",115.3);
		CreadorCurso profesor4=new CreadorCurso("Programacion","LidiRG",136.9);
		CreadorCurso profesor5=new CreadorCurso("Literatura", "RaulFJ",150.9);
		CreadorCurso profesor6=new CreadorCurso("Ingles", "RaulFJ",160.8);
		CreadorCurso profesor7=new CreadorCurso("Frances", "RaulFJ", 100.30);
		CreadorCurso profesor8=new CreadorCurso( "Redes de computadoras","RaulFJ", 200.5);
		CreadorCurso profesor9=new CreadorCurso("Interfaces de usuario", "MartinMF", 300.4);
		CreadorCurso profesor10=new CreadorCurso("Arquitectura de computadores", "MartinMF", 280.9);
		CreadorCurso profesor11=new CreadorCurso("Italiano", "MartinMF", 198.3);
		CreadorCurso profesor12=new CreadorCurso("Chino","MartinMF", 120.6);
		CreadorCurso profesor13=new CreadorCurso("Criptografia", "AlbaMP", 200.4);
		CreadorCurso profesor14=new CreadorCurso("SSOO", "AlbaMP", 321.6);
		CreadorCurso profesor15=new CreadorCurso("Ficheros", "AlbaMP", 123.4);
		CreadorCurso profesor16=new CreadorCurso("ADE", "AlbaMP", 176.9);
		CreadorCurso profesor17=new CreadorCurso("Algebra Lineal", "BelenNC", 120.2);
		CreadorCurso profesor18=new CreadorCurso("Calculo", "BelenNC",190.5);
		CreadorCurso profesor19=new CreadorCurso("Calculo Diferencial", "BelenNC", 120.8);
		CreadorCurso profesor20=new CreadorCurso("Matematica Discreta", "BelenNC", 215.8);
		

	
		
		
		ccdao= new CreadorCursoDAO(em,ut);
		rpdao=new ResultadoPruebaDAO(em, ut);
		pdao=new PruebaDAO(em, ut);
		ldao=new LeccionDAO(em,ut);
		sdao=new SeccionDAO(em,ut);
		idao=new ImagenDAO(em, ut);
		cdao=new CursoDAO(em, ut);
		udao=new UsuarioDAO(em, ut);
		mdao=new MatriculadoDAO(em,ut);
		
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
		
		cdao.guardarCurso(curso1);
		cdao.guardarCurso(curso2);
		cdao.guardarCurso(curso3);
		cdao.guardarCurso(curso4);
		cdao.guardarCurso(curso5);
		cdao.guardarCurso(curso6);
		cdao.guardarCurso(curso7);
		cdao.guardarCurso(curso8);
		cdao.guardarCurso(curso9);
		cdao.guardarCurso(curso10);
		
		cdao.guardarCurso(curso11);
		cdao.guardarCurso(curso12);
		cdao.guardarCurso(curso13);
		cdao.guardarCurso(curso14);
		cdao.guardarCurso(curso15);
		cdao.guardarCurso(curso16);
		cdao.guardarCurso(curso17);
		cdao.guardarCurso(curso18);
		cdao.guardarCurso(curso19);
		cdao.guardarCurso(curso20);
		
		idao.guardarImagen(imagen1);
		idao.guardarImagen(imagen2);
		
		sdao.guardarSeccion(seccion1);
		sdao.guardarSeccion(seccion2);
		sdao.guardarSeccion(seccion3);
		sdao.guardarSeccion(seccion4);
		sdao.guardarSeccion(seccion5);
		sdao.guardarSeccion(seccion6);
		sdao.guardarSeccion(seccion7);
		sdao.guardarSeccion(seccion8);
		sdao.guardarSeccion(seccion9);
		sdao.guardarSeccion(seccion10);
		sdao.guardarSeccion(seccion11);
		sdao.guardarSeccion(seccion12);
		sdao.guardarSeccion(seccion13);
		sdao.guardarSeccion(seccion14);
		sdao.guardarSeccion(seccion15);
		sdao.guardarSeccion(seccion16);
		sdao.guardarSeccion(seccion17);
		sdao.guardarSeccion(seccion18);
		sdao.guardarSeccion(seccion19);
		sdao.guardarSeccion(seccion20);
		
		ldao.guardarLeccion(leccion1);
		ldao.guardarLeccion(leccion2);
		ldao.guardarLeccion(leccion3);
		ldao.guardarLeccion(leccion4);
		ldao.guardarLeccion(leccion5);
		ldao.guardarLeccion(leccion6);
		ldao.guardarLeccion(leccion7);
		ldao.guardarLeccion(leccion8);
		ldao.guardarLeccion(leccion9);
		ldao.guardarLeccion(leccion10);
		ldao.guardarLeccion(leccion11);
		ldao.guardarLeccion(leccion12);
		ldao.guardarLeccion(leccion13);
		ldao.guardarLeccion(leccion14);
		ldao.guardarLeccion(leccion15);
		ldao.guardarLeccion(leccion16);
		ldao.guardarLeccion(leccion17);
		ldao.guardarLeccion(leccion18);
		ldao.guardarLeccion(leccion19);
		ldao.guardarLeccion(leccion20);
		
		pdao.guardarPrueba(prueba1);
		pdao.guardarPrueba(prueba2);
		pdao.guardarPrueba(prueba3);
		pdao.guardarPrueba(prueba4);
		pdao.guardarPrueba(prueba5);
		pdao.guardarPrueba(prueba6);
		pdao.guardarPrueba(prueba7);
		pdao.guardarPrueba(prueba8);
		pdao.guardarPrueba(prueba9);
		pdao.guardarPrueba(prueba10);
		pdao.guardarPrueba(prueba11);
		pdao.guardarPrueba(prueba12);
		pdao.guardarPrueba(prueba13);
		pdao.guardarPrueba(prueba14);
		pdao.guardarPrueba(prueba15);
		pdao.guardarPrueba(prueba16);
		pdao.guardarPrueba(prueba17);
		pdao.guardarPrueba(prueba18);
		pdao.guardarPrueba(prueba19);
		pdao.guardarPrueba(prueba20);
		
		rpdao.guardarResultadoPrueba(resultado1);
		rpdao.guardarResultadoPrueba(resultado2);
		rpdao.guardarResultadoPrueba(resultado3);
		rpdao.guardarResultadoPrueba(resultado4);
		rpdao.guardarResultadoPrueba(resultado5);
		rpdao.guardarResultadoPrueba(resultado6);
		rpdao.guardarResultadoPrueba(resultado7);
		rpdao.guardarResultadoPrueba(resultado8);
		rpdao.guardarResultadoPrueba(resultado9);
		rpdao.guardarResultadoPrueba(resultado10);
		rpdao.guardarResultadoPrueba(resultado11);
		rpdao.guardarResultadoPrueba(resultado12);
		rpdao.guardarResultadoPrueba(resultado13);
		rpdao.guardarResultadoPrueba(resultado14);
		rpdao.guardarResultadoPrueba(resultado15);
		rpdao.guardarResultadoPrueba(resultado17);
		rpdao.guardarResultadoPrueba(resultado18);
		rpdao.guardarResultadoPrueba(resultado19);
		rpdao.guardarResultadoPrueba(resultado20);
		
		ccdao.guardarProfesor(profesor1);
		ccdao.guardarProfesor(profesor2);
		ccdao.guardarProfesor(profesor3);
		ccdao.guardarProfesor(profesor4);
		ccdao.guardarProfesor(profesor5);
		ccdao.guardarProfesor(profesor6);
		ccdao.guardarProfesor(profesor7);
		ccdao.guardarProfesor(profesor8);
		ccdao.guardarProfesor(profesor9);
		ccdao.guardarProfesor(profesor10);
		ccdao.guardarProfesor(profesor11);
		ccdao.guardarProfesor(profesor12);
		ccdao.guardarProfesor(profesor13);
		ccdao.guardarProfesor(profesor14);
		ccdao.guardarProfesor(profesor15);
		ccdao.guardarProfesor(profesor16);
		ccdao.guardarProfesor(profesor17);
		ccdao.guardarProfesor(profesor18);
		ccdao.guardarProfesor(profesor19);
		ccdao.guardarProfesor(profesor20);
		
		mdao.guardarMatriculado(matriculado1);
		mdao.guardarMatriculado(matriculado2);
		mdao.guardarMatriculado(matriculado3);
		mdao.guardarMatriculado(matriculado4);
		mdao.guardarMatriculado(matriculado5);
		mdao.guardarMatriculado(matriculado6);
		mdao.guardarMatriculado(matriculado7);
		mdao.guardarMatriculado(matriculado8);
		mdao.guardarMatriculado(matriculado9);
		mdao.guardarMatriculado(matriculado10);
		mdao.guardarMatriculado(matriculado11);
		mdao.guardarMatriculado(matriculado12);
		mdao.guardarMatriculado(matriculado13);
		mdao.guardarMatriculado(matriculado14);
		mdao.guardarMatriculado(matriculado15);
		mdao.guardarMatriculado(matriculado16);
		mdao.guardarMatriculado(matriculado17);
		mdao.guardarMatriculado(matriculado18);
		mdao.guardarMatriculado(matriculado19);
		mdao.guardarMatriculado(matriculado20);

		
		
		
		
		
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
				if (u  != null &&clave1.equals(u.getClave())) {
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
				String claveNueva = request.getParameter("claveNueva");
				//String RclaveNueva = request.getParameter("RclaveNueva");
				if (claveActual != null) {
					Long idUsuario = (Long) sesion.getAttribute("idUsuario");
					Usuarios u = udao.buscarId(idUsuario);
					if (claveActual.equals(u.getClave())) {
						u.setClave(claveNueva);
					}					
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
