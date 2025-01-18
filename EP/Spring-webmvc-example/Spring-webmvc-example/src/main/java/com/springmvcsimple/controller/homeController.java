package com.springmvcsimple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

	@RequestMapping(value =  "/")
	public String landing() {
		return "index";
	}
	@RequestMapping(value =  "/index")
	public String index() {
		return "index";
	}
	@RequestMapping(value =  "/aboutus")
	public String aboutus() {
		return "aboutus";
	}
	
	@RequestMapping(value =  "/contactus")
	public String contact() {
		return "contactus";
	}
	
}
