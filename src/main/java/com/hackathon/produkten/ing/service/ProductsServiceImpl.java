package com.hackathon.produkten.ing.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.produkten.ing.dto.Overview;
import com.hackathon.produkten.ing.dto.ProductDTO;
import com.hackathon.produkten.ing.model.Product;
import com.hackathon.produkten.ing.model.ProductGroup;
import com.hackathon.produkten.ing.repository.ProductGroupRepository;
import com.hackathon.produkten.ing.repository.ProductRepository;
/**
 * @author user1
 * Product Service Implementation Class to get the Product Groups and Product details
 *
 */

@Service
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
	ProductGroupRepository productGroupRepository;
	
	@Autowired
	ProductRepository productRepository;
	/**
	 * @author user1
	 * Method to list the group of available products
	 *
	 */
	@Override
	public List<Overview> getProductGroups() {
		
		List<Overview> overViewList = new ArrayList<>();
		List<ProductGroup> productGroupList = productGroupRepository.findAll();
		productGroupList.stream().forEach(p -> {
			overViewList.add(new Overview(p.getProductGroupName(),getProductNamesFromGroup(p)));
		});
		 return overViewList;
	}
	/**
	 * @author user1
	 * Method to get the Product details
	 *
	 */
	@Override
	public ProductDTO getProductDetails(String productName, String groupName) {
		
		ProductGroup productGroup = productGroupRepository.findByProductGroupName(groupName);
		
		Product product = productRepository.findByProductGroupId(productName,productGroup.getId());
		ProductDTO productDTO =convertToDTO(product);
		List<String> productNameList = new ArrayList<>();
		productGroup.getProduct()
		.stream()
		.forEach(
				(p)->{
					if(!p.getProductName().equalsIgnoreCase(productName))
						productNameList.add(p.getProductName());
						});
		productDTO.setOtherProducts(productNameList);
		return productDTO;
	}

	private List<Map<String,String>> getProductNamesFromGroup(ProductGroup p) {
		List<Map<String,String>> productNames = new ArrayList<>();
		p.getProduct().stream().forEach(n ->{
			Map<String,String> productMap = new HashMap<>();
			productMap.put("name",n.getProductName());
			productNames.add(productMap);});
		return productNames;
	}
	
	private ProductDTO convertToDTO(Product product) {
		
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(product, ProductDTO.class);
		
	}

}
