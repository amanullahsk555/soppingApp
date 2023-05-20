package com.shopping_mall.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping_mall.entity.Admin;
import com.shopping_mall.exception.DataNotFoundException;
import com.shopping_mall.payload.AdminDto;
import com.shopping_mall.payload.AdminLoginDto;
import com.shopping_mall.repository.AdminRepository;
import com.shopping_mall.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;
	
	
	
	private AdminDto mapToDto(Admin admin) {
		AdminDto dto=new AdminDto();
		dto.setId(admin.getId());
		dto.setName(admin.getName());
		dto.setMobile(admin.getMobile());
		dto.setEmail(admin.getEmail());
		dto.setLoginId(admin.getLoginId());
		dto.setPassword(admin.getPassword());
		dto.setReferBy(admin.getReferBy());
		return dto;
	}
	
	private Admin mapToEntity(AdminDto dto) {
		Admin admin=new Admin();
		admin.setId(dto.getId());
		admin.setName(dto.getName());
		admin.setMobile(dto.getMobile());
		admin.setEmail(dto.getEmail());
		admin.setLoginId(dto.getLoginId());
		admin.setPassword(dto.getPassword());
		admin.setReferBy(dto.getReferBy());
		return admin;
	}

	@Override
	public boolean checkLoginDetails(AdminLoginDto adminLoginDto) {
		Admin admin = adminRepository.findByLoginId(adminLoginDto.getLoginId()).orElseThrow(
				()->new DataNotFoundException("Login Id doesn't match")
				);
		if(admin.getPassword().equals(adminLoginDto.getPassword())) {
			return true;
		}
		return false;
	}

	@Override
	public String addThisAdmin(AdminDto adminDto) {
		Admin admin=mapToEntity(adminDto);
		admin.setDateOfAdded(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
		Admin savedData = adminRepository.save(admin);
		if(adminDto.getLoginId()=="") {

			Admin addData=savedData;
			addData.setId(savedData.getId());
			addData.setLoginId("XYZ00"+savedData.getId());
			adminRepository.save(addData);
			return "Your Login Id is-"+addData.getLoginId();
		}
		return "Data Saved!";
	}

	@Override
	public AdminDto getThisAdminDetails(String loginId) {
		Admin admin = adminRepository.findByLoginId(loginId).orElseThrow(()->new DataNotFoundException("invalid Login Id"));
		AdminDto dto=mapToDto(admin);
		return dto;
	}

}
