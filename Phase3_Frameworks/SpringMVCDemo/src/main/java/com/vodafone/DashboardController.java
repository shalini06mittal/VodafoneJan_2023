package com.vodafone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

	@GetMapping
	public String dashboard()
	{
		return "dashboard";
	}
}
