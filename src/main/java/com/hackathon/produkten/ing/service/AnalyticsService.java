package com.hackathon.produkten.ing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.produkten.ing.dto.AnalyticsDTO;
import com.hackathon.produkten.ing.model.Analytics;
import com.hackathon.produkten.ing.repository.AnalyticsRepository;

@Service
public class AnalyticsService {

	@Autowired
	private AnalyticsRepository analyticsRepository;
	
	public AnalyticsDTO updateCount(String groupName) {
		Analytics analytics = analyticsRepository.findByGroupName(groupName);
		analytics.setVisitCount(analytics.getVisitCount()+1);
		Analytics savedAnalytics = analyticsRepository.save(analytics);
		AnalyticsDTO analyticsDTO = new AnalyticsDTO();
		
		analyticsDTO.setGroupName(savedAnalytics.getGroupName());
		analyticsDTO.setVisitCount(analyticsDTO.getVisitCount());
		
		return analyticsDTO;
		
	}
	
	
}
