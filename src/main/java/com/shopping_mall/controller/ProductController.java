package com.shopping_mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopping_mall.payload.ProductDto;
import com.shopping_mall.service.ProductService;

@Controller
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/addProduct")
	public String callAddProductPage(@RequestParam("adminId") String adminId,Model map) {
		if(AdminController.loginTocken.equals("active")) {
			map.addAttribute("adminId", adminId);
			return "AddProduct";
		}else {
			map.addAttribute("msg", "Login Again");
			return "LoginAdminPage";
		}
		
	}
	
	@RequestMapping("/saveProduct")
	public String addThisProductData(ProductDto productDto,Model map) {
		if(AdminController.loginTocken.equals("active")) {
			String msg = productService.addThisProduct(productDto);
			map.addAttribute("msg", msg);
			map.addAttribute("adminId", productDto.getAddedBy());
			return "AddProduct";
		}else {
			map.addAttribute("msg", "Login Again");
			return "LoginAdminPage";
		}
	}

}
