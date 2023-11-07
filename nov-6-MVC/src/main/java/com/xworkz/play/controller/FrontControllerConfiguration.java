package com.xworkz.play.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontControllerConfiguration {
	public FrontControllerConfiguration()
	{
		System.out.println("Bean Configuration is created");
	}
	
	@RequestMapping(value="/get" , method=RequestMethod.GET)
	public String get() {
		System.out.println("Create  the get method");
		return "player.jsp";
	}
	@RequestMapping(value="/getData" , method=RequestMethod.GET)
	public String getData(Model model)
	{
		model.addAttribute("message","Good Morning");
		return "player.jsp";
		
	}

}
