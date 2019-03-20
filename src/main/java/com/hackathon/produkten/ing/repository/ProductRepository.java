package com.hackathon.produkten.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.produkten.ing.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
