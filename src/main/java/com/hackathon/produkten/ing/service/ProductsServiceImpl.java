package com.hackathon.produkten.ing.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.produkten.ing.dto.Overview;
import com.hackathon.produkten.ing.model.ProductGroup;
import com.hackathon.produkten.ing.repository.ProductGroupRepository;

@Service
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
	ProductGroupRepository productGroupRepository;

	@Override
	public List<Overview> getProductGroups() {
		
		List<Overview> overViewList = new ArrayList<>();
		List<ProductGroup> productGroupList = productGroupRepository.findAll();
		productGroupList.stream().forEach(p -> {
			overViewList.add(new Overview(p.getProductGroupName(),getProductNamesFromGroup(p)));
		});
		 return null;
	}

	private List<String> getProductNamesFromGroup(ProductGroup p) {
		List<String> productNames = new ArrayList<>();
		p.getProduct().stream().forEach(n -> productNames.add(n.getProductName()));
		return productNames;
	}

}
