package com.bsCamp.SpringBootDBDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bsCamp.SpringBootDBDemo.entity.Product;
import com.bsCamp.SpringBootDBDemo.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/save")
	public ResponseEntity<Product>saveProduct(){
		Product p = new Product();
		p.setPname("coffee");
		p.setQuantity(500);
		p.setUnit_price(200);
		Product newProduct = productService.save(p);
		return new ResponseEntity<Product>(newProduct,HttpStatus.ACCEPTED);	
	}
	
	@GetMapping(value="/get/products")
	public ResponseEntity<List<Product>>saveProducts(){
		List<Product>products = productService.getProducts();
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);	
	}
	
	@GetMapping(value="/get/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id")int id){
		Product product  = productService.getProduct(id);
		return new ResponseEntity<Product>(product,HttpStatus.OK);	
	}
	
	
	
	

}
