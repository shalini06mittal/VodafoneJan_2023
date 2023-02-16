package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.CustomerDatabase;
import entity.Customer;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// display list of all the customers registered?
		System.out.println(getServletContext().getContextPath() );
		PrintWriter out = response.getWriter();
		CustomerDatabase db = new CustomerDatabase();
		try {
			List<Customer> customers = db.getAllCustomers();
			if(customers.size() == 0)
				out.println("<h2>No cutomers registered yet</h2>");
			else {
				out.println("<!DOCTYPE html>\n"
						+ "<html>\n"
						+ "<head>\n"
						+ "<meta charset=\"UTF-8\">\n"
						+ "<title>Insert title here</title>\n"
						+ "<link\n"
						+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\n"
						+ "	rel=\"stylesheet\"\n"
						+ "	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\n"
						+ "	crossorigin=\"anonymous\">\n"
						+ "<style>\n"
						+ "</style>\n"
						+ "</head>\n"
						+ "<body><div class='container'>"
						+ "<table class='table'>");
				out.println("<tr>"
						+ "<th>Email</th>"
						+ "<th>City</th>"
						+ "<th>Phone</th>"
						+ "<th>isMember</th>"
						+ "<th>Edit</th>"
						+ "<th>Delete</th>"
						+ "</tr>");
				for(Customer customer : customers)
				{
					out.println("<tr>"
							+ "<td>"+customer.getEmail()+"</td>"
							+ "<td>"+customer.getCity()+"</td>"
							+ "<td>"+customer.getPhone()+"</td>");
							if(customer.isIsmember())
								out.println("<td>Yes</td>");
							else
								out.println("<td>No</td>");
							out.println("<td><a href='edit'>Edit</a></td>");
							out.println("<td><a href='"+ getServletContext().getContextPath() +"/delete?email="+customer.getEmail()+ "'>Delete</a></td>");
//							out.println("<td><a href='delete'>Delete</a></td>");
							out.println("</tr>");
				}
				out.println("</table></div></body></html>");
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
