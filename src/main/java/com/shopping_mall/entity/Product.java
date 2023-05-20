package com.shopping_mall.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "product_table")
public class Product { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique = true)
	private String productId;
	@Column(unique = true)
	private String productName;
	private float price;
	private int productQty;
	private String counterNumber;
	private String dateOfAdded;
	private String addedBy;
	
	@OneToMany(mappedBy = "product")
	private List<Images> images;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public String getCounterNumber() {
		return counterNumber;
	}

	public void setCounterNumber(String counterNumber) {
		this.counterNumber = counterNumber;
	}

	public String getDateOfAdded() {
		return dateOfAdded;
	}

	public void setDateOfAdded(String dateOfAdded) {
		this.dateOfAdded = dateOfAdded;
	}

	public List<Images> getImages() {
		return images;
	}

	public void setImages(List<Images> images) {
		this.images = images;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	
	
	

}
