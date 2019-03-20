package com.hackathon.produkten.ing.dto;

<<<<<<< HEAD:src/main/java/com/hackathon/produkten/ing/dto/AnalyticsDTO.java
/**
 * @author user1
 * DTO class for Analytics
 *
 */
public class AnalyticsDTO {
=======
public class MetricsDTO {
>>>>>>> 0cee6f64bbccc0f0762dce70b7880f476dac9283:src/main/java/com/hackathon/produkten/ing/dto/MetricsDTO.java
	private Long Id;
	private String groupName;
	private Long visitCount;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Long getVisitCount() {
		return visitCount;
	}
	public void setVisitCount(Long visitCount) {
		this.visitCount = visitCount;
	}
	
	
	
}
