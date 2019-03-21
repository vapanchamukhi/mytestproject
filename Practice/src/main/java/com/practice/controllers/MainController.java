package com.practice.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/")
@CrossOrigin(origins = "http://localhost:4200")
public class MainController {

	@GetMapping("home")
	public String test() {
		return "index";
	}
	
}
