package com.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void add() {
	    public void add(@RequestParam("username") String username, @RequestParam("password") String password) {
	        System.out.println("Received username: " + username);
	        System.out.println("Received password: " + password);	
	}
}

