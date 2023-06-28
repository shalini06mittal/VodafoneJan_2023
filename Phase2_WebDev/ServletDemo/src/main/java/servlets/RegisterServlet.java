package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.CustomerDatabase;
import entity.Customer;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/add")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String city = request.getParameter("city");
		String phone = request.getParameter("phone");
		String ismember = request.getParameter("ismember");
		System.out.println(email);
		System.out.println(password);
		System.out.println(city);
		System.out.println(phone);
		System.out.println(ismember);
		CustomerDatabase db = new CustomerDatabase();
		Customer c1 = new Customer();
		c1.setCity(city);
		c1.setEmail(email);
		c1.setPassword(password);
		c1.setPhone(phone);
		if(ismember != null && ismember.equals("on"))
			c1.setIsmember(true);
		try {
			if(db.insertCustomer(c1))
			{
				// take me to which page? login page
				response.sendRedirect("login.html");
			}
			else {
				//response.sendRedirect("register.html");
				RequestDispatcher dispatcher = request.getRequestDispatcher("register.html");
				PrintWriter out = response.getWriter();
				out.println("<p>Registration unsuccessful</p>");
				dispatcher.include(request, response);
			}
		} catch (SQLException e) {
			// keep me on registration page
			response.sendRedirect("register.html");
			
		}
	}

}
