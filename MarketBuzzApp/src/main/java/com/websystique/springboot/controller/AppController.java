package com.websystique.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

	@RequestMapping("/")
	String home(ModelMap modal) {
		System.out.println("home AppController");
		modal.addAttribute("title","Market Buzz");
		return "index";
	}

	@RequestMapping("/partials/{page}")
	String partialHandler(@PathVariable("page") final String page) {
		System.out.println("/partials/{page} AppController");
		return page;
	}
	
	@RequestMapping("/list")
	String listForUsers(ModelMap modal) {
		System.out.println("/list AppController");
		modal.addAttribute("title","Market Buzz");
		return "/partials/list";
	}

}
