package com.fullstack.todoapp.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TodoControllers {
	
	@GetMapping("/hellojava")
	public String helloController() {
		return "Hello from Java service";
	}
}
