package com.Security.Spring2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleDemoLoginController {
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}

	
}
