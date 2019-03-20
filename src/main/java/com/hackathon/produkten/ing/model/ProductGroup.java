package com.hackathon.produkten.ing.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity

/**
 * @author user1
 * Model class for Product Groups
 *
 */
public class ProductGroup {
    @Id
	private Long id;
	private String productGroupName;
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="product_group_id")
	private List<Product> product;
	
	public String getProductGroupName() {
		return productGroupName;
	}
	public void setProductGroupName(String productGroupName) {
		this.productGroupName = productGroupName;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
