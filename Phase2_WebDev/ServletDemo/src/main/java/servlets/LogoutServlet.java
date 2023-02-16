package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LogoutServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("id");
		if(email == null) response.sendRedirect("login.html");
		else {
			session.removeAttribute("id");
			session.invalidate();
			Cookie cookies[] = request.getCookies();
			for(Cookie cookie:cookies)
			{
				if(cookie.getName().equals("JSESSIONID"))
				{
					cookie.setMaxAge(0);
					response.addCookie(cookie);
					break;
				}
			}
			PrintWriter out = response.getWriter();

			out.println("<h1>Thanks "+email+" for visiting</h1>");
			out.println("<p>Logged out successfully</p>");
			out.println("<p><a href='login.html'>Login</a></p>");
			out.println("<p><a href='index.html'>Home</a></p>");
		}
	}


}
