package com.hackathon.produkten.ing.dto;

import java.util.List;

public class Overview {
	
	private String productGroupName;
	private List<String> products;
	
	public Overview(String productGroupName, List<String> productNames) {
		this.productGroupName=productGroupName;
		this.products=productNames;
	}
	public String getProductGroupName() {
		return productGroupName;
	}
	public void setProductGroupName(String productGroupName) {
		this.productGroupName = productGroupName;
	}
	public List<String> getProducts() {
		return products;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	
}
