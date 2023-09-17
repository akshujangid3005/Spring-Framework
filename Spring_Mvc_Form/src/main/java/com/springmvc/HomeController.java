package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.entity.User;

@Controller
public class HomeController {
  
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/register")
	public String signup() {
		return"register";
	}
@RequestMapping(path="/createUser",method=RequestMethod.POST)	
public String registerUser(@ModelAttribute User user,@RequestParam("act")String act) {
	System.out.println(user);
	System.out.println("actname= "+act);
	
	
	
	
	return"register";
}

}

