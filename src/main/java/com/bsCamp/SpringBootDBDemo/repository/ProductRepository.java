package com.bsCamp.SpringBootDBDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bsCamp.SpringBootDBDemo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

}