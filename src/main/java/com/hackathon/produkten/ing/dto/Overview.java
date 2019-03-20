package com.hackathon.produkten.ing.dto;

import java.util.List;
import java.util.Map;

/**
 * @author user1
 * DTO class for Overview
 *
 */
public class Overview {
	
	private String productGroupName;
	private List<Map<String,String>> products;
	
	public Overview() {}
	
	public Overview(String productGroupName, List<Map<String,String>> productNames) {
		this.productGroupName=productGroupName;
		this.products=productNames;
	}
	public String getProductGroupName() {
		return productGroupName;
	}
	public void setProductGroupName(String productGroupName) {
		this.productGroupName = productGroupName;
	}
	public List<Map<String,String>> getProducts() {
		return products;
	}
	public void setProducts(List<Map<String,String>> products) {
		this.products = products;
	}
	
}
