package com.takeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.takeo.model.User;

@Controller
public class RegistrationController {

	@RequestMapping("/")
public String loadForm()
{
	return "register.html";
}
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	//@PostMapping("/insert")
	public String handleForm(@ModelAttribute("user")     User user,Model model)
	{

		model.add.addAttribute("user",user);
		
		
		
		return "user-data.html";
	}
	
	
	
	
}
