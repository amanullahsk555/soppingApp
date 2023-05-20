package com.shopping_mall.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping_mall.entity.Product;
import com.shopping_mall.payload.ProductDto;
import com.shopping_mall.repository.ProductRepository;
import com.shopping_mall.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	private Product mapToEntity(ProductDto dto) {
		Product product=new Product();
		product.setProductName(dto.getProductName());
		product.setProductId(dto.getProductId());
		product.setPrice(dto.getPrice());
		product.setProductQty(dto.getProductQty());
		product.setCounterNumber(dto.getCounterNumber());
		product.setDateOfAdded(new SimpleDateFormat("dd-MM-yyyy_hh:mm:ss").format(new Date()));
		product.setAddedBy(dto.getAddedBy());
		return product;
	}

	@Override
	public String addThisProduct(ProductDto dto) {
		Product product=mapToEntity(dto);
		Product save = productRepository.save(product);
		if(save.getProductId()=="") {
			Product addProduct=save;
			addProduct.setProductId("PID00"+save.getId());
			productRepository.save(addProduct);
			return "Product Id is-"+save.getProductId();
		}
		
		return "Product Added!!";
	}

}
