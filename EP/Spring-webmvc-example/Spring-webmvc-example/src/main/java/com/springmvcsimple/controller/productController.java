package com.springmvcsimple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class productController {
	
	@RequestMapping(value =  "/products")
	public String products() {
		return "products";
	}
}
