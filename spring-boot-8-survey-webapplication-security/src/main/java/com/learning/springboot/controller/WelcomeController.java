package com.learning.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.service.WelcomeService;

@RestController
public class WelcomeController {
	// Auto wiring
	@Autowired
	private WelcomeService service;

	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
}
