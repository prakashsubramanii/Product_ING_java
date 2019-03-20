package com.hackathon.produkten.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.produkten.ing.dto.Overview;
import com.hackathon.produkten.ing.service.ProductsService;

@RestController
@CrossOrigin
@RequestMapping("/api/products")
public class ProductsController {
	
	@Autowired
	ProductsService productsService;
	
	@GetMapping
	public ResponseEntity<List<Overview>> getProductGroups(){
		return new ResponseEntity<List<Overview>>(productsService.getProductGroups(),HttpStatus.OK);
	}

}
