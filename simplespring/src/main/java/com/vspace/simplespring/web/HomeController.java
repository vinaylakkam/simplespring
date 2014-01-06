package com.vspace.simplespring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("") 
	public String showHome(){
		return "home";
	}

	
	@RequestMapping("/test")
	@ResponseBody
	public String test1(){
		return "test";
	}
}
