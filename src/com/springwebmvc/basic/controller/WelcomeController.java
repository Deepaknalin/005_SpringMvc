package com.springwebmvc.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public ModelAndView welcomeSpring(){
		
		String message = "Hello from Spring MVC";
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("msg",message);
		return mv;
	}
	
	@RequestMapping("/add")
	public ModelAndView addMethod(){
		
		String message ="Add new Record!!!";
		return new ModelAndView("add","addmessage", message);
	}
	
	@RequestMapping("/list")
	public ModelAndView listMethod(){
		
		String message ="List of all Record!!!";
		return new ModelAndView("list","listmessage", message);
	}
	
	

}
