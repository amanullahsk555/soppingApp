package com.shopping_mall.payload;

import java.util.List;


import org.springframework.web.multipart.MultipartFile;

import com.shopping_mall.entity.Product;

public class ImagesDto {
	private long id;
	private MultipartFile image;
	private List<Product> product;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	

}
