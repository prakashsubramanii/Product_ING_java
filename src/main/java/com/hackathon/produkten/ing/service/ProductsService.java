package com.hackathon.produkten.ing.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hackathon.produkten.ing.dto.Overview;

@Service
public interface ProductsService {

	public List<Overview> getProductGroups();

}
