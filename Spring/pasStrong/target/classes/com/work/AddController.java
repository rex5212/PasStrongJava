package com.work;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddController {
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void add() {
		System.out.println("im here");
	}
}
