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
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "Vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vehicleId")
	private int vehicleId;
	private String manufacturer;
	private String model;
	private String vehicleType;
	@Column(unique=true)
	private String drivinglicense;
	private Date purchaseDate;
	@Column(unique=true)
	private int engineNumber;
	@Column(unique=true)
	private String chasisNumber;
	
	// Mapping the column of this table 
    @ManyToOne(cascade= CascadeType.ALL)
    //Adding the name
    @JoinColumn(name = "user_id",nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;
    
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getDrivinglicense() {
		return drivinglicense;
	}
	public void setDrivinglicense(String drivinglicense) {
		this.drivinglicense = drivinglicense;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getChasisNumber() {
		return chasisNumber;
	}
	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	public Vehicle(String manufacturer, String model, String vehicleType, String drivinglicense, Date purchaseDate,
			int engineNumber, String chasisNumber, User user) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.vehicleType = vehicleType;
		this.drivinglicense = drivinglicense;
		this.purchaseDate = purchaseDate;
		this.engineNumber = engineNumber;
		this.chasisNumber = chasisNumber;
		this.user = user;
	}
	public Vehicle() {
		super();
		
	}
	
	
	
	

}
