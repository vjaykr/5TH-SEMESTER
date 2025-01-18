package com.springmvcsimple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class serviceController {
	
	@RequestMapping(value =  "/services")
	public String services() {
		return "services";
	}

}
