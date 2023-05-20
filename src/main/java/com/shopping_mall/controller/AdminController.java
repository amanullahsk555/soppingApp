package com.shopping_mall.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopping_mall.payload.AdminDto;
import com.shopping_mall.payload.AdminLoginDto;
import com.shopping_mall.service.AdminService;
@Controller
public class AdminController {
	
	
	@Autowired
	private AdminService adminService;
	
	static String loginTocken=null;
	
	
	@RequestMapping("/loginAdmin")
	public String openLoginAdminPage() {
		return "LoginAdminPage";
	}

	@RequestMapping("/checkLoginData")
	public String checkLoginData(AdminLoginDto adminLoginDto, ModelMap map) {
		boolean details = adminService.checkLoginDetails(adminLoginDto);
		if(details==true) {
			loginTocken="active";
			AdminDto adminDetails = adminService.getThisAdminDetails(adminLoginDto.getLoginId());
			map.addAttribute("adminName", adminDetails.getName());
			map.addAttribute("adminId", adminLoginDto.getLoginId());
			return "AdminPage";
		}else {
			map.addAttribute("msg", "Login Id/Password doesn't match");
			return "LoginAdminPage";
		}
	}
	@RequestMapping("/addMoreAdminPage")
	public String callMoreAdminPage(@RequestParam("adminId") String adminId, ModelMap map) {
		if(loginTocken.equals("active")) {
			map.addAttribute("adminId", adminId);
			return "AddMoreAdmin";
		}else {
			map.addAttribute("msg", "Login Again");
			return "LoginAdminPage";
		}
		
	}
	
	@RequestMapping("/addThisAdmin")
	public String addThisAdmin(AdminDto adminDto,ModelMap map) {
		if(loginTocken.equals("active")) {
			String msg = adminService.addThisAdmin(adminDto);
			map.addAttribute("adminId", adminDto.getReferBy());
			map.addAttribute("msg",msg);
			return "AddMoreAdmin";
		}else {
			map.addAttribute("msg", "Login Again");
			return "LoginAdminPage";
		}
	}
	@RequestMapping("/logout")
	public String LogoutAdmin() {
		loginTocken="in-active";
		return "LoginAdminPage";
	}
	
}
