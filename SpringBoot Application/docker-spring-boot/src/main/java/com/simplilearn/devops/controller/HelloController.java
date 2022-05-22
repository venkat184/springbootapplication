package com.simplilearn.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("rest/docker/hello")
public class HelloController {
	
	@GetMapping	
	public String hello() {
		return "Hello Server is up and running";
	}
	@RequestMapping(value ="/homepage", method =  RequestMethod.GET)
    public String showHomePage() {
    	return "homepage.jsp";
    }
	
	

}
