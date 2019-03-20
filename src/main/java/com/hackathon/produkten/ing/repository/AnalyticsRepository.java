package com.hackathon.produkten.ing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.produkten.ing.model.Analytics;

/**
 * @author user1
 * Repository Interface for Analytics
 *
 */
public interface AnalyticsRepository  extends JpaRepository<Analytics, Long> {

	public Analytics findByGroupName(String groupName);
}
