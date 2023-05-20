package com.shopping_mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping_mall.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
