package com.example.srms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.srms.model.Admin;

@EnableJpaRepositories
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	Admin findByUsername(String username);	
}
