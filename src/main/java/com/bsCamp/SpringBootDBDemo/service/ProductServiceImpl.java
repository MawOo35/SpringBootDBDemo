package com.bsCamp.SpringBootDBDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bsCamp.SpringBootDBDemo.entity.Product;
import com.bsCamp.SpringBootDBDemo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product save(Product product) {
		Product newProduct = productRepository.save(product);
		return  newProduct ;
	}

	@Override
	public List<Product> getProducts() {
		List<Product> products = productRepository.findAll();
		return products;
	}

	@Override
	public Product getProduct(int id) {
		return null;
	}

}
