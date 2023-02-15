package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    // html embedded inside java
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("GET");
		System.out.println("Req method "+ request.getMethod());
		//http://localhost:8080/ServletDemo/home?name=shalini
		// access query parameters
		String name = request.getParameter("name");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome Guest FROM GET</h1>");
		out.println("<p>Hey !!! "+name+"</p>");
		out.println("<p>Hey !!! "+fname+"</p>");
		out.println("<p>Hey !!! "+lname+"</p>");
		out.println("<p>Hey !!! "+password+"</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("POST");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		out.println("<h1>Welcome Guest FROM POST</h1>");
		
		out.println("<p>Hey !!! "+fname+"</p>");
		out.println("<p>Hey !!! "+lname+"</p>");
		out.println("<p>Hey !!! "+password+"</p>");
	}

}
