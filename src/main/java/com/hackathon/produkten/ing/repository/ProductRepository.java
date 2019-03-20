package com.hackathon.produkten.ing.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hackathon.produkten.ing.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query(value="SELECT * FROM product p where p.product_name = ?1 and product_group_id = ?2",nativeQuery=true)
	public Product findByProductGroupId(String productName, String groupName);
}
