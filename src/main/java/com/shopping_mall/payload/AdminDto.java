package com.shopping_mall.payload;


public class AdminDto {
	private long id;
	private String Name;
	private String mobile;
	private String email;
	private String loginId;
	private String password;
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
	public String getReferBy() {
		return referBy;
	}
	public void setReferBy(String referBy) {
		this.referBy = referBy;
	}
	
	
	

}
