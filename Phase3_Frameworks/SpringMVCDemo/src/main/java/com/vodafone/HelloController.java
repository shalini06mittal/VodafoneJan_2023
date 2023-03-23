package com.vodafone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.vodafone.database.CustomerDB;
import com.vodafone.dto.CustomerDTO;
import com.vodafone.entity.Customer;
import com.vodafone.entity.LoginEntity;
import com.vodafone.service.LoginService;
/**
 * 1. create a webapp maven project
 * 2. add dependencies and update <properties> tag in pom.xml file
 * 3. Create config package and the 2 classes within it
 * 4. Create folder views within WEB-INF folder and  hello.jsp file within the views folder
 * 5. Create HelloController and return the name of the view i.e jsp file
 * 6. Run As - Run On server, configure tomcat
 * 
 * @author Shalini
 *
 */
@Controller
public class HelloController {

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private CustomerDB db;
	
	public HelloController() {
		System.out.println("Hello controller was created");
	}
	@GetMapping("/hi")
	public String helloView()
	{
		// this hello should exactly match with tje hello.jsp file
		return  "hello";
	}
	
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping("/login")
	public String loginUser(HttpServletRequest req)
	{
		System.out.println("login controller ");
		System.out.println(req.getMethod());
		
		// this hello should exactly match with tje hello.jsp file
		return  "login";
	}
	
	@GetMapping("/admin")
	public String adminPage(HttpServletRequest req, HttpSession session)
	{
		if(session.getAttribute("email") == null)
			return "redirect:login";
		System.out.println("login controller ");
		System.out.println(req.getMethod());
		
		// this hello should exactly match with tje hello.jsp file
		return  "admin";
	}
	
	@PostMapping("/login")
	public String login(LoginEntity entity, Map<String, String> error,
			HttpSession session)
	{
		System.out.println("login post");
		if(entity.getEmail().equalsIgnoreCase("admin") &&  entity.getPassword().equalsIgnoreCase("admin"))
		{
			session.setAttribute("email", entity.getEmail());
			List<CustomerDTO> customers = this.db.getCustomers();
			session.setAttribute("customers", customers);
			return "redirect:admin";
		}
		try {
			if(this.loginService.checkLogin(entity.getEmail(), entity.getPassword()))
			{
				session.setAttribute("email", entity.getEmail());
				return "redirect:dashboard";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("error");
	
			error.put("error", e.getMessage());
			return "login";
			//return "login?error="+e.getMessage();
		}
		System.out.println("***");
		return  "redirect:login";
	}
	
	@GetMapping("/register")
	public String registerUser()
	{
		System.out.println("register controller");
		// this hello should exactly match with tje hello.jsp file
		return  "register";
	}
	
	@GetMapping("/logout")
	public String logoutUser(HttpSession session)
	{
		session.removeAttribute("email");
		session.removeAttribute("customers");
		session.invalidate();
		System.out.println("register controller");
		// this hello should exactly match with tje hello.jsp file
		return  "redirect:login";
	}
	
	@PostMapping("/register")
	public String registerCustomer(Customer customer)
	{
		
		System.out.println(customer);
		if(this.db.insertCustomer(customer))
		{
			return "redirect:login";
		}
		return "register";
		
	}
	
	
}

