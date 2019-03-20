package com.hackathon.produkten.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.produkten.ing.model.ProductGroup;

@Repository
public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {

	public ProductGroup findByProductGroupName();
}
