package com.security.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleDemoHelloController {
	
	
	@GetMapping("/admin")
	public String admin()
	{	
		return "Welcome Admin";
	}
	

}
