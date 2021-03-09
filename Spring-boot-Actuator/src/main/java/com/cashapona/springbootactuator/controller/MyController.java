package com.cashapona.springbootactuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springbootactuator")
public class MyController {
	
	@GetMapping("/test")
	public String testEndpoint() {
		return "Welcome to cashapona";
	}

}
