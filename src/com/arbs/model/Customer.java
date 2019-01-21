package com.arbs.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="CustomerRegistration")
public class Customer {
	
	
	@Column(name="Custid")
	private String id;
	@Column(name="FisrtName")
	private String firstname;
	@Column(name="LastName")
	private String lastName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return Pin;
	}
	public void setPin(String pin) {
		Pin = pin;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	@Column(name="Address")
	private String address;
	@Column(name="City")
	private String city;
	@Column(name="ZipCode")
	private String Pin;
	@Column(name="branch")
	private String branch;
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="Phone")
	private String phone;
	@Column(name="Email")
	private String email;
	@Column(name="Gender")
	private String gender;
	@Column(name="DateOfBirth")
	private String Dob;
	/*@Column(name="status")
	private boolean status;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}*/
	
	
	
	
	

}
