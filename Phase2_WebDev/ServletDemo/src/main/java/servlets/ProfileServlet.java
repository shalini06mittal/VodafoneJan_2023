package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.CustomerDatabase;
import entity.Customer;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
    	System.out.println("Profile Servlet");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Profile DO GET");
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
		response.setHeader("Pragma", "no-cache");//http1.0
		response.setHeader("Pragma", "0");//proxies
		
//		String email = (String) request.getParameter("email");
		
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("id");
		if(email!=null) {
			try {
			CustomerDatabase database = new CustomerDatabase();
			Customer customer = database.getCustomerByEmail(email);
			PrintWriter out = response.getWriter();
			out.println("<h1>Profile</h1>");
			out.println("<div style='color:yellow;width:50%;"
					+ " padding:5px;background-color:#434040;"
					+ "text-align:center;margin:0 auto;'>");
			out.println("<p>Welcome "+email+" </p>");
			out.println("<p>Here are your details</p>");
			out.println("<p>City "+customer.getCity()+" </p>");
			out.println("<p>Phone "+customer.getPhone()+" </p>");
			if(customer.isIsmember())
			out.println("<p>Member : YES</p>");
			
			else
				out.println("<p>Member : NO</p>");
			out.println("</div>");
			out.println("<p><a href='dashboard'>Dashboard</a></p>");
			out.println("<p><a href='bills'>Bills</a></p>");
			out.println("<p><a href='logout'>Logout</a></p>");
		
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		else
			 response.sendRedirect("login.html");
	}

}
