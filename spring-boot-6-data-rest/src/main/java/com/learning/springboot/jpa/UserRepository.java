package com.learning.springboot.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
	
	// This method is also provided by SPRING BOOT
	List<User> findByRole(String role);
}