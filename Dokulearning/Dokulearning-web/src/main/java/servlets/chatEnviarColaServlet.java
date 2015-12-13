package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


import javax.jms.Message;
import javax.jms.TextMessage;
import javax.servlet.http.HttpServlet;

import jhc.info.InformacionProperties;

/**
 * @version 1.0
 * @author Jesus Hernando
 */
public class chatEnviarColaServlet extends HttpServlet {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 6598296317492442565L;

	public void doPost(javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response)
			throws javax.servlet.ServletException, java.io.IOException {

		javax.jms.QueueSender Qsen=null;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Ejemplo de envio de mensaje</title></head>");
		out.println("<body>");
		out.println("<H1><U>Envio de mensaje</U></H1>");

		try {

			// Inicializamos el contexto y la sesión ------------------------------------------------------------------------------
			javax.naming.InitialContext contextoInicial = new javax.naming.InitialContext();

			// Hacemos el lookup a la factoria y a la cola ------------------------------------------------------------------------
			javax.jms.QueueConnectionFactory factory = (javax.jms.QueueConnectionFactory) contextoInicial.lookup(InformacionProperties.getQCF());
			javax.jms.Queue cola = (javax.jms.Queue) contextoInicial.lookup(InformacionProperties.getQueue());

			// Vamos a escribir un mensaje ........................................................................................
			// Creamos la conexión ------------------------------------------------------------------------------------------------
			javax.jms.QueueConnection Qcon = factory.createQueueConnection();

			// Creamos la sesión: indicamos que a sesion no soporta transacciones -------------------------------------------------
			javax.jms.QueueSession QSes = Qcon.createQueueSession(false,
					javax.jms.QueueSession.AUTO_ACKNOWLEDGE);

			// Asignamos la sesión a la cola --------------------------------------------------------------------------------------
			Qsen = QSes.createSender(cola);

			// Definimos el mensaje de texto --------------------------------------------------------------------------------------
			javax.jms.TextMessage men = QSes.createTextMessage();

			// Asignamos el mensaje -----------------------------------------------------------------------------------------------
			men.setText(request.getParameter("mensaje"));

			// Mandamos el mensaje a través del Sender ----------------------------------------------------------------------------
			Qsen.send(men);

			// Cerramos la sesión -------------------------------------------------------------------------------------------------
			Qsen.close();

			// Cerramos la conexión -----------------------------------------------------------------------------------------------
			Qcon.close();

			out.println(" Mensaje enviado correctamente </BR>");

		} catch (javax.jms.JMSException e) {
//			System.out
//					.println(".....JHC *************************************** Error en el doPost: "
//							+ e);
			System.out
					.println(".....JHC *************************************** Error de MQ: "
							+ e.getLinkedException().getMessage());
			System.out
					.println(".....JHC *************************************** Error de MQ: "
							+ e.getLinkedException().toString());
			out.println(" Error al enviar el mensaje</BR>");

		} catch (Exception e) {
			e.printStackTrace();
			System.out
					.println("JHC *************************************** Error en el doPost: "
							+ e.getMessage());
			out.println(" Error al enviar el mensaje</BR>");
		}

		out
				.println(" >>>>>>  <A href=\"EnviarMensajeCola.html\">Volver a inicio</A></P>");
		out.println("</body></html>");

	}

	public void doGet(javax.servlet.http.HttpServletRequest request,
			javax.servlet.http.HttpServletResponse response)
			throws javax.servlet.ServletException, java.io.IOException {

		try {
			// Llamamos al método doPost con los parametros que recibe este
			// método
			doPost(request, response);
		} catch (Exception e) {
			System.out
					.println("JHC ***************************************Error en el doGet: "
							+ e);
		}

	}

}