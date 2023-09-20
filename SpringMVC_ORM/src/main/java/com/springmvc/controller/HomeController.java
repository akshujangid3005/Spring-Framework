package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entity.User;
import com.springmvc.service.UserServices;

@Controller
public class HomeController {
	
	@Autowired
	private UserServices userServices;
	
   @RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/register")
	public String signup() {
		return"register";
	}
@RequestMapping(path="/createUser",method=RequestMethod.POST)	
public String registerUser(@ModelAttribute User user,@RequestParam("act")String act ,Model m ) {
	user.setAction(act);
	userServices.saveUser(user);
	
	return"submit";
}
}
