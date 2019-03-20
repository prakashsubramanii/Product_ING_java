package com.hackathon.produkten.ing.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author user1
 * Model class for Product
 *
 */
@Entity
public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
    private String productName;
	private String percentage;
	private String interestRate;
	private String special;
	private String depositAndWithdrawal;
	private String minInvestment;
	private String maxInvestment;
	private String duration;
	
	public Long getId() {
		return id;
	}
	public void setId(Long productId) {
		this.id = productId;
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

}
