package com.vspace.simplespring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/t")
@Controller
public class TestController {
	
	@ResponseBody
	@RequestMapping("")
	public String t(){
		return "TTTTTTTTT";
	}
	

}
