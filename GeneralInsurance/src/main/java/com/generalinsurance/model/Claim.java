package com.generalinsurance.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Entity
public class Claim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="claimId")
	private int claimId;
	private Date date;
	private String approval;
	private double amount;
	private int policyNumber;
	private String reason;
//	{
//		"date":"1999-12-01",
//		"approval" : "done",
//		"amount": 23879.98,
//		"policyNumber":1235,
//		"reason":"jktyfygiuwg hvhr"
//	}
	
	// Mapping the column of this table 
    @ManyToOne(cascade= CascadeType.ALL)
    //Adding the name
    @JoinColumn(name = "userId",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;


	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}


	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", date=" + date + ", approval=" + approval + ", amount=" + amount
				+ ", policyNumber=" + policyNumber + ", reason=" + reason + "]";
	}

	public Claim(Date date, String approval, double amount, int policyNumber, String reason, User user) {
		super();
		this.date = date;
		this.approval = approval;
		this.amount = amount;
		this.policyNumber = policyNumber;
		this.reason = reason;
		this.user = user;
	}
	

	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
}
