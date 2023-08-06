package com.example.company.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class ProjectController {
	
	
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

}

