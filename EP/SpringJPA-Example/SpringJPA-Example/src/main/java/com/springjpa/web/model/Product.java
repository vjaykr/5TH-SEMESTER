package com.springjpa.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String brand;
	private float price;
	 
	public Product() { }

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }
	
	public String getName() { return name; }
	public void setName(String name) {	this.name = name; }
	
	public String getBrand() { return brand; }
	public void setBrand(String brand) { this.brand = brand; }

	public float getPrice() { return price; }
	public void setPrice(float price) { this.price = price; }
}
