package com.springjpa.web.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springjpa.web.model.Product;

@Service
@Transactional
public class ProductRepositoryImpl  {
	
	@Autowired
	ProductRepository repo;
	
	public List<Product> listAll() {
		return repo.findAll();
	}
	     
	public void save(Product product) {
		repo.save(product);
	}
	     
	public Product get(long id) {
		return repo.findById(id).get();
	}
	     
	public void delete(long id) {
		repo.deleteById(id);
	}
}