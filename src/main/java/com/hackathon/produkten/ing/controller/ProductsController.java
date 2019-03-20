package com.hackathon.produkten.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.produkten.ing.dto.Overview;
import com.hackathon.produkten.ing.dto.ProductDTO;
import com.hackathon.produkten.ing.service.ProductsService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductsController {
	
	@Autowired
	ProductsService productsService;
	
	@GetMapping("/products")
	public ResponseEntity<List<Overview>> getProductGroups(){
		return new ResponseEntity<List<Overview>>(productsService.getProductGroups(),HttpStatus.OK);
	}
	
	@GetMapping("/product/{groupName}/{productName}")
	public ResponseEntity<ProductDTO> getProductDetails(@PathVariable("groupName") String groupName,
			@PathVariable("productName") String productName){
		ProductDTO productDto = productsService.getProductDetails(productName, groupName);
		return new ResponseEntity<>(productDto,HttpStatus.OK);
	}

}
