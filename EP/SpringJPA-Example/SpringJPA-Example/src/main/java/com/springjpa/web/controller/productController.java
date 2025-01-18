package com.springjpa.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.springjpa.web.repository.ProductRepositoryImpl;
import com.springjpa.web.model.Product;

@Controller
public class productController {

	@Autowired
	ProductRepositoryImpl service;
	
	@GetMapping("/")
	public ModelAndView landing(ModelAndView model) {
		model.addObject("allproducts", service.listAll());
		model.setViewName("index");
		return model;
	}

	@GetMapping("/newProduct")
	public ModelAndView newProduct(ModelAndView model) {
		model.addObject("product", new Product());
		model.setViewName("newProduct");
		return model;
	}

	@GetMapping("/edit/{id}")
	public ModelAndView editProduct(@PathVariable int id, ModelAndView model) {
		model.addObject("product", service.get(id));
		model.setViewName("newProduct");
		return model;
	}
	
	@GetMapping("/delete/{id}")
	public String delProduct(@PathVariable int id, Model model) {
		service.delete(id);
		model.addAttribute("allproducts", service.listAll());
		return "index";
	}
}
