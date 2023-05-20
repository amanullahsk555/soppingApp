package com.shopping_mall.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "admin_table")
public class Admin { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String Name;
	@Column(unique = true)
	private String mobile;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private String loginId;
	private String password;
	private String dateOfAdded;
	private String referBy;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDateOfAdded() {
		return dateOfAdded;
	}
	public void setDateOfAdded(String dateOfAdded) {
		this.dateOfAdded = dateOfAdded;
	}
	public String getReferBy() {
		return referBy;
	}
	public void setReferBy(String referBy) {
		this.referBy = referBy;
	}
	
	
	
	
	
	

}
