package com.generalinsurance.model;

import java.util.Date;

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
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="paymentId")
	private int paymentId;
	private Date paymentDate;
	private double paymentAmount;
	private String paymentDescription;
	
//	{
//		"paymentDate":"1999-11-27",
//		"paymentAmount":1635.57,
//		"paymentDescription":"iugiwegiewvbiuesd"
//	}
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "planId",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private InsurancePlan plan;
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentDescription() {
		return paymentDescription;
	}
	public void setPaymentDescription(String paymentDescription) {
		this.paymentDescription = paymentDescription;
	}
	
	
	
	public InsurancePlan getPlan() {
		return plan;
	}
	public void setPlan(InsurancePlan plan) {
		this.plan = plan;
	}
	
	public Payment(Date paymentDate, double paymentAmount, String paymentDescription, InsurancePlan plan) {
		super();
		this.paymentDate = paymentDate;
		this.paymentAmount = paymentAmount;
		this.paymentDescription = paymentDescription;
		this.plan = plan;
	}
	public Payment() {
		super();
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", paymentAmount=" + paymentAmount
				+ ", paymentDescription=" + paymentDescription + "]";
	}
	
	
	//private User user;
}