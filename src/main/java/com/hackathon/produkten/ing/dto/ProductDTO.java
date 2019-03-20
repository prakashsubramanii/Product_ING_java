package com.hackathon.produkten.ing.dto;

import java.util.List;

public class ProductDTO {

	private Long id;
    private String productName;
	private String percentage;
	private String interestRate;
	private String special;
	private String depositAndWithdrawal;
	private String minInvestment;
	private String maxInvestment;
	private String duration;
	private List<String> otherProducts;
	
	public ProductDTO() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public String getDepositAndWithdrawal() {
		return depositAndWithdrawal;
	}
	public void setDepositAndWithdrawal(String depositAndWithdrawal) {
		this.depositAndWithdrawal = depositAndWithdrawal;
	}
	public String getMinInvestment() {
		return minInvestment;
	}
	public void setMinInvestment(String minInvestment) {
		this.minInvestment = minInvestment;
	}
	public String getMaxInvestment() {
		return maxInvestment;
	}
	public void setMaxInvestment(String maxInvestment) {
		this.maxInvestment = maxInvestment;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<String> getOtherProducts() {
		return otherProducts;
	}

	public void setOtherProducts(List<String> otherProducts) {
		this.otherProducts = otherProducts;
	}
	
}
