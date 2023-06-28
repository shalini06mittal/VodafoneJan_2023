package com.vodafone;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

	@GetMapping
	public String dashboard( HttpSession session)
	{
		if(session.getAttribute("email") == null)
			return "redirect:login";
		return "dashboard";
	}
}
