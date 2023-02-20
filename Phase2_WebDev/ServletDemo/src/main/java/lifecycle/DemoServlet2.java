package lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/demo2")
public class DemoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String email;
	private String adminname;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet2() {
        System.out.println("Demo Servlet 2 Constructor");
    }

    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	System.out.println("Demo Servlet 2 init method");
    	this.email="demo@gmail.com";
    	this.adminname= getServletContext().getInitParameter("adminname");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Demo Servlet 2 GET");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h2>Contact "+email+"</h2>" );
		out.println("<h2>Name "+adminname+"</h2>" );
	}

	@Override
	public void destroy() {
		System.out.println("Demo Servlet 2 destroy method");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
