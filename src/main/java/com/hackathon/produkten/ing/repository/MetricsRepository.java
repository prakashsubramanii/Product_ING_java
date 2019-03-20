package com.hackathon.produkten.ing.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.produkten.ing.model.Metrics;

public interface MetricsRepository  extends JpaRepository<Metrics, Long> {

	public Metrics findByGroupName(String groupName);
}
