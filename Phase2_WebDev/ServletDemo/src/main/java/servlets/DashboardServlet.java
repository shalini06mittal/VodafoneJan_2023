package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DashboardServlet
 */
@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashboardServlet() {
    	System.out.println("Dashboard Servlet");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Dashboard DO GET");
		//String email = (String) request.getAttribute("email");
//		String email = (String) request.getParameter("email");
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
		response.setHeader("Pragma", "no-cache");//http1.0
		response.setHeader("Pragma", "0");//proxies
		
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("id");
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mangoes");
		fruits.add("Banana");
		session.setAttribute("fruits", fruits);
		if(email != null) {
			PrintWriter out = response.getWriter();
			out.println("<h1>GET request</h1>");
			out.println("<p>Welcome "+email+" </p>");
			out.println("<p><a href='profile'>Profile</a></p>");
			out.println("<p><a href='bills'>Bills</a></p>");
			out.println("<p><a href='logout'>Logout</a></p>");
		}
		else response.sendRedirect("login.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String email = (String) request.getAttribute("email");
//		PrintWriter out = response.getWriter();
//		out.println("<h1>POST request</h1>");
//		out.println("<p>Welcome "+email+" </p>");
//	}

}
