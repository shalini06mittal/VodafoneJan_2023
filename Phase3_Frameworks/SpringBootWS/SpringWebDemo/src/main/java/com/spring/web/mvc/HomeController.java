package com.spring.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.web.entity.Author;

// thymeleaf , velocity, freemarker, jsp
@Controller
public class HomeController {

	public HomeController() {
		System.out.println("home controller constructor");
	}
	@GetMapping("/login")
	public String homePage()
	{
		System.out.println("login page");
		return "login";
	}
	@GetMapping("/response")
	public @ResponseBody Author sendData()
	{
		return new Author(1, "Shalini", "IT");
	}
}
