package com.bsCamp.SpringBootDBDemo.serviceTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bsCamp.SpringBootDBDemo.entity.Product;
import com.bsCamp.SpringBootDBDemo.repository.ProductRepository;
import com.bsCamp.SpringBootDBDemo.service.ProductServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
	
	@Mock
	private ProductRepository productRepository;
	
	@InjectMocks
	ProductServiceImpl productServiceImpl;
	
	@BeforeEach
	private void setup() {
		Product product = new Product();
		product.setP_id(1);
		product.setPname("coffee");
		product.setQuantity(500);
		product.setUnit_price(20);
	}
	
//	@DisplayName("Test for save Product in service layer")
//	@Test
//	public void givenSaveProduct_sendProductData_thenReturnProjectObj() {
//		given(productRepository.save(product)).willReturn(product);
//		Product saveProduct = productServiceImpl.save(product);
//	}
//	
	

}
