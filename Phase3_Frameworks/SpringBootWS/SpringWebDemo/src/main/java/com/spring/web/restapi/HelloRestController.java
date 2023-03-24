package com.spring.web.restapi;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
@RequestMapping("/rest")
public class HelloRestController {

	@GetMapping
	public String getData()
	{
		return "GET CALLED";
	}
	@PostMapping
	public String postData()
	{
		return "POST CALLED";
	}
	@PutMapping
	public String putData()
	{
		return "PUT CALLED";
	}
	@DeleteMapping
	public String deleteData()
	{
		return "DELETE CALLED";
	}
	
}
