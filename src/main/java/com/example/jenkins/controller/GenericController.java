package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class GenericController {

	@GetMapping("/msg")
	public String getMessage() {
		return "Hello Spring boot";
	}
	
}
