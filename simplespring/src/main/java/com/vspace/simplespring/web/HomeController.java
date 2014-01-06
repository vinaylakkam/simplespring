package com.vspace.simplespring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("")
	public String showHome() {
		return "home";
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public String test1(@RequestParam("wishText") String wishText, Model model) {

		model.addAttribute("wishText",wishText);

		return "wish";
	}
}
