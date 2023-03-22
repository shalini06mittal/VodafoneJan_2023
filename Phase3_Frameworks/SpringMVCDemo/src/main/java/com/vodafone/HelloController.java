package com.vodafone;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	@PostMapping("/login")
	public String login(LoginEntity entity, Map<String, String> error)
	{
		System.out.println("login post");
		try {
			if(this.loginService.checkLogin(entity.getEmail(), entity.getPassword()))
			{
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
	@PostMapping("/register")
	public String registerCustomer(Customer customer)
	{
		System.out.println(customer);
		return "redirect:login";
	}
	
	
}

