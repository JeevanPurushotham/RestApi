package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePage {
	@RequestMapping("/Jeevan")
	public ModelAndView print(String Myname) {  //http://localhost:8080/Jeevan?Myname=Jeevannnnnnnnnnn
		ModelAndView m = new ModelAndView();
		m.addObject("name", Myname);
		m.setViewName("home.jsp");
		return m;
	}
}
