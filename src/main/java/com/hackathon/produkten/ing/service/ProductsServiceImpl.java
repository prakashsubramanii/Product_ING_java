package com.hackathon.produkten.ing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.produkten.ing.dto.Overview;
import com.hackathon.produkten.ing.repository.ProductGroupRepository;

@Service
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
	ProductGroupRepository productGroupRepository;

	@Override
	public List<Overview> getProductGroups() {
		
		List<Overview> overViewList = null;
		 productGroupRepository.findAll();
		 return null;
	}

}
