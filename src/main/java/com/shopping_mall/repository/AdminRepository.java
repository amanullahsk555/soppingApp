package com.shopping_mall.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping_mall.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	public Optional<Admin> findByLoginId(String loginId);

}
