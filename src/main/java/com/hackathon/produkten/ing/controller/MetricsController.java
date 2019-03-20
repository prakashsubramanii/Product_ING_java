package com.hackathon.produkten.ing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.produkten.ing.dto.MetricsDTO;
import com.hackathon.produkten.ing.service.MetricsService;

@RestController
@RequestMapping("/api")
public class MetricsController {
	
	@Autowired
	MetricsService metricsService;
	
	@GetMapping("/metrics")
	public ResponseEntity<List<MetricsDTO>> getMetrics(){
		return new ResponseEntity<>(metricsService.getMetrics(),HttpStatus.OK);
	}

}
