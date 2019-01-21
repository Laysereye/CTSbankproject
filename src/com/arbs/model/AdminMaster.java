package com.arbs.model;

import javax.persistence.*;

@Entity
@Table(name="admin_information")
	public class AdminMaster 
{
	@Id
	@Column(name="AdminId")
	private String adminid;
	@Column(name="Password")
	private String password;
	@Column(name="Role")
	private String role;
	
	
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
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
	
	
	
}
