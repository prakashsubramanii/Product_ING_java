package com.hackathon.produkten.ing.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.produkten.ing.dto.MetricsDTO;
import com.hackathon.produkten.ing.model.Metrics;
import com.hackathon.produkten.ing.repository.MetricsRepository;

@Service
public class MetricsService {

	@Autowired
	private MetricsRepository metricsRepository;

	public MetricsDTO updateCount(String groupName) {
		Metrics metrics = metricsRepository.findByGroupName(groupName);
		metrics.setVisitCount(metrics.getVisitCount() + 1);
		Metrics savedmetrics = metricsRepository.save(metrics);
		MetricsDTO metricsDTO = new MetricsDTO();

		metricsDTO.setGroupName(savedmetrics.getGroupName());
		metricsDTO.setVisitCount(metricsDTO.getVisitCount());

		return metricsDTO;

	}

	public List<MetricsDTO> getMetrics(){
		return convertToDTOList(metricsRepository.findAll());
	}

	private List<MetricsDTO> convertToDTOList(List<Metrics> metrics) {

		List<MetricsDTO> metricsDTOList = new ArrayList<>();
		ModelMapper modelMapper = new ModelMapper();
		for(Metrics metric : metrics) {
			metricsDTOList.add(modelMapper.map(metric, MetricsDTO.class));
		}
		return metricsDTOList;

	}

}
