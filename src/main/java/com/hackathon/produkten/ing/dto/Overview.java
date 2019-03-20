package com.hackathon.produkten.ing.dto;

import java.util.List;

public class Overview {
	
	private String productGroup;
	private List<String> products;
	
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	public List<String> getProducts() {
		return products;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	
}
