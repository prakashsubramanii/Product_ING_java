package com.hackathon.produkten.ing.dto;

/**
 * @author user1
 * DTO class for Analytics
 *
 */
public class AnalyticsDTO {
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
