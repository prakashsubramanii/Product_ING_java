package com.hackathon.produkten.ing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hackathon.produkten.ing.dto.Overview;
import com.hackathon.produkten.ing.dto.ProductDTO;

@Service
public interface ProductsService {

	public List<Overview> getProductGroups();

	public ProductDTO getProductDetails(String productName, String groupName);

}
