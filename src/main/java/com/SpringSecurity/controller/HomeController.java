package com.SpringSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String sayHi() {
		return "Hi Spring Security I am JAVA Developer";
	}
}
