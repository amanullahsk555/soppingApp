package com.shopping_mall.service;

import com.shopping_mall.payload.AdminDto;
import com.shopping_mall.payload.AdminLoginDto;

public interface AdminService {

	public boolean checkLoginDetails(AdminLoginDto adminLoginDto);
	public String addThisAdmin(AdminDto adminDto);
	public AdminDto getThisAdminDetails(String loginId);
}
