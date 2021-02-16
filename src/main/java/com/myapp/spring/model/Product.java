package com.myapp.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                      // It implies that this is a persistent class
@Table(name="newproducts")   // It is the name of the table to which we are gonna map it
public class Product {
	
	
	@Id                                     // We don't have to define id it will be auto generated
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productId;
	
	private String productName;
	
	private Double price;
	
	private String description;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, Double price, String description) {
		this.productName = productName;
		this.price = price;
		this.description = description;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
