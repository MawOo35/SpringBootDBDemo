package com.bsCamp.SpringBootDBDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int p_id;
	@Column(name="product_name",unique=true,length=50)
	private String pname;
	private int quantity;
	private int unit_price;
	
	
	public Product(int p_id, String pname, int quantity, int unit_price) {
		super();
		this.p_id = p_id;
		this.pname = pname;
		this.quantity = quantity;
		this.unit_price = unit_price;
	}

	public Product() {}
	
	public int getP_id() {
		return p_id;
	}


	public void setP_id(int p_id) {
		this.p_id = p_id;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getUnit_price() {
		return unit_price;
	}


	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}


	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", pname=" + pname + ", quantity=" + quantity + ", unit_price=" + unit_price
				+ "]";
	}
	
	
	
	
}
