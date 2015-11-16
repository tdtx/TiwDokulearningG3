package filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Este filtro intercepta cualquier peticion que vaya a la pagina listado.jsp y
 * comprueba que el usuario se haya autenticado con un token en sesion, en caso
 * contrario le devuelve a la pagina de login.jsp
 * 
 * @author David Palomar
 */

// "/formularioCurso.jsp", "/matriculacionDeCurso.jsp", "/perfilUsuario.jsp",
// "/vistaPreviaCurso.jsp"
@WebFilter(urlPatterns = {})
public class LoginFilter implements Filter {

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpSession sesion = ((HttpServletRequest) request).getSession();

		if (sesion.getAttribute("acceso") != null
				&& sesion.getAttribute("acceso").equals("ok")) {

			chain.doFilter(request, response);
		} else {
			request.getRequestDispatcher("/index.jsp").forward(request,
					response);
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
