package com.Rabih.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabihController {
	
	@GetMapping("/")
public String getMessage()
{
	return "Welcome to git and jenkins inteagration";
}
}
