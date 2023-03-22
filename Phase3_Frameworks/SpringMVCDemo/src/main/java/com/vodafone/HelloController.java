package com.vodafone;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vodafone.entity.Customer;
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

