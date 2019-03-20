package com.hackathon.produkten.ing.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hackathon.produkten.ing.dto.ProductDTO;
import com.hackathon.produkten.ing.model.Product;
import com.hackathon.produkten.ing.model.ProductGroup;
import com.hackathon.produkten.ing.repository.ProductGroupRepository;
import com.hackathon.produkten.ing.repository.ProductRepository;

import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

	@MockBean
	ProductGroupRepository productGroupRepository;

	@MockBean
	ProductRepository productRepository;

	@Autowired
	ProductsService productsService;

	@Test
	public void getProductGroupsTest() throws JsonProcessingException {
		List<Product> products = new ArrayList<>();
		List<ProductGroup> groups = new ArrayList<>();
		List<Map<String, String>> productNames = new ArrayList<>();
		Map<String, String> productMap = new HashMap<>();

		Product product = new Product();
		product.setProductName("Child Savings Scheme");
		product.setDepositAndWithdrawal("Always possible");
		product.setDuration("unlimited");
		product.setInterestRate("fixed");
		product.setMaxInvestment("none");
		product.setMinInvestment("0");
		product.setPercentage("13.4");
		product.setSpecial("");

		products.add(product);
		ProductGroup productGroup = new ProductGroup();
		productGroup.setProductGroupName("Mortgage");
		productGroup.setProduct(products);
		groups.add(productGroup);

		productMap.put("name", "Child Savings Scheme");
		productNames.add(productMap);

		Mockito.when(productGroupRepository.findAll()).thenReturn(groups);
		Assert.assertNotNull(productsService.getProductGroups());
	}

	@Test
	public void getProductDetailsTest() {
		Product product = new Product();
		product.setProductName("Child Savings Scheme");
		product.setDepositAndWithdrawal("Always possible");
		product.setDuration("unlimited");
		product.setInterestRate("fixed");
		product.setMaxInvestment("none");
		product.setMinInvestment("0");
		product.setPercentage("13.4");
		product.setSpecial("");
		Mockito.when(productRepository.findByProductGroupId(Mockito.anyString(), Mockito.anyLong()))
				.thenReturn(product);

		ProductDTO expected = this.convertToDTO(product);
		ProductDTO actual = productsService.getProductDetails("Child Savings Scheme", "Mortgage");

		Assert.assertEquals(expected, actual);

	}

	private ProductDTO convertToDTO(Product product) {

		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(product, ProductDTO.class);

	}

}
