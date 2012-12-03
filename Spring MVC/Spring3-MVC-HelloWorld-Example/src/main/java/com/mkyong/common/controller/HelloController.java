package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome1(ModelMap model) {
		System.out.println("Inside method1");
		model.addAttribute("message", "Spring 3 MVC Hello World welcome1");
		return "hello";

	}

	@RequestMapping(value="/hi",method = RequestMethod.GET)
	public String printWelcome2(ModelMap model) {
		System.out.println("Inside method2");
		model.addAttribute("message", "Spring 3 MVC1111 Hello World welcome2");
		return "hello2";

	}
	
}