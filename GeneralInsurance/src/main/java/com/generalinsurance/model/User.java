package com.generalinsurance.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId")
	private int userId;
	private String name;
	@Column(unique=true)
	private String email;
	private Date dob;
	@Column(unique=true)
	private long contactNumber;
	private String address;
	@Column(unique=true)
	private String password;
	private String role;

	// Mapping to the other table
//	@OneToMany(fetch = FetchType.EAGER,mappedBy="user",cascade = CascadeType.ALL)
//    private List<Vehicle> listInsurance = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

//	public List<Vehicle> getlistInsurance() {
//		return listInsurance;
//	}
//
//	public void setlistInsurance(List<Vehicle> listInsurance) {
//		this.listInsurance = listInsurance;
//	}

	public User(String name, String email, Date dob, long contactNumber, String address, String password, String role,
			List<Vehicle> listInsurance) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.contactNumber = contactNumber;
		this.address = address;
		this.password = password;
		this.role = role;
//		this.listInsurance = listInsurance;
	}

	public User() {
		super();
	}

	
	
	

}
