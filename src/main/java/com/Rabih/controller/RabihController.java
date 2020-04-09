package com.Rabih.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RabihController {
	
	@GetMapping("/")
public String getMessage()
{
	return "Welcome to GitAWSCodeDep;oy";
}
	@GetMapping("/root")
	public String getAWS()
	{
		return "welcome to AWS";
	}
}
