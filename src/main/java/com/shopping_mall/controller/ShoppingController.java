package com.shopping_mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShoppingController {

	@RequestMapping("/shoppingPage")
	public String openShoppingPage() {
		return "Shopping_Page";
	}
	
	
}
