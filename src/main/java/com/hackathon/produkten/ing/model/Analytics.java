package com.hackathon.produkten.ing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Analytics {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
