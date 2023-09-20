package com.springmvc.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

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
@RequestMapping(path="/google")
public String redirectpage() {
	return"redirect:https://www.google.com";
}
   @RequestMapping(path="/load_file_upload")
   public String loadFileUploadPage() {
	   return"file_upload";
   }
   
   @RequestMapping(path="/fileUpload",method=RequestMethod.POST)
   public String fileUpload(@RequestParam("docs")CommonsMultipartFile file, HttpServletRequest req,Model  m) {
	   System.out.println(file.getName());
	   System.out.println(file.getOriginalFilename());
	   System.out.println(file.getContentType());
	   System.out.println(file.getSize());
	  
	   
	 byte[] bytes=  file.getBytes();
	String path=   req.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resource"+File.separator+"docs"+File.separator+file.getOriginalFilename();
	System.out.println(path);
  try {
		FileOutputStream fos= new FileOutputStream(path);
		
		fos.write(bytes);
		fos.close();
		System.out.println("File Uploaded");
} catch (Exception e) {
	e.printStackTrace();
}
	m.addAttribute("docsname",file.getOriginalFilename());
	
	
	   return"file_succsesful";
   }


}
