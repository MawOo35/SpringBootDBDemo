package com.bsCamp.SpringBootDBDemo.service;

import java.util.List;

import com.bsCamp.SpringBootDBDemo.entity.Product;

public interface ProductService {
	//CRUD
	public Product save(Product product);

	public List<Product> getProducts();

	public Product getProduct(int id);

}
