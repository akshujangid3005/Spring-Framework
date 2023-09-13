package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/site")
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model m) {
		m.addAttribute("name","Akshay jangid");
		return "home";
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView model= new ModelAndView();
		model.addObject("ClassName","10th class");
		model.addObject("registernumber","8768658");
		model.setViewName("login");
		
		return model;
	}
}
 