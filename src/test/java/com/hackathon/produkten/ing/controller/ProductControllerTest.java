package com.hackathon.produkten.ing.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.hackathon.produkten.ing.controller.ProductsController;
import com.hackathon.produkten.ing.dto.Overview;
import com.hackathon.produkten.ing.service.ProductsService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ProductsController.class)
public class ProductControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@Autowired
	ProductsController productsController;
	@MockBean
	ProductsService prodService;

	@Test
	public void retrieveProductGroups() throws Exception {

		List<Map<String, String>> productNames = new ArrayList<>();
		Map<String, String> productMap = new HashMap<>();
		Map<String, String> productMap1 = new HashMap<>();
		productMap.put("name", "Child Savings Scheme");
		productMap1.put("name", "Orange savings account");
		productNames.add(productMap);
		productNames.add(productMap1);
		List<Overview> list = new ArrayList();
		Overview productOverview = new Overview("ProductGroup1", productNames);
		Overview productOverview1 = new Overview("ProductGroup2", null);
		list.add(productOverview);
		list.add(productOverview1);

		Mockito.when(prodService.getProductGroups()).thenReturn(list);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/products").accept(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		String expected = "[{\"id\":1,\"productName\":\"Savings\"},{\"id\":1,\"productName\":\"Payments\"}]";
        Assert.assertNotNull(result.getResponse());
		// assertEquals("shivu", userdetails.getUserName());

	}
}
