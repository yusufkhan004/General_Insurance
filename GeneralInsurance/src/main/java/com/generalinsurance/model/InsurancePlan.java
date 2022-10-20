package com.generalinsurance.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="InsurancePlan")
public class InsurancePlan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="planId")
	private int planId;
	
	private String planType;
	private int planDuration;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "userId",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public int getPlanDuration() {
		return planDuration;
	}

	public void setPlanDuration(int planDuration) {
		this.planDuration = planDuration;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public InsurancePlan(String planType, int planDuration, User user) {
		super();
		this.planType = planType;
		this.planDuration = planDuration;
		this.user = user;
	}

	public InsurancePlan() {
		super();
	}
	
	
}
