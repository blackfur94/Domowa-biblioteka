package com.sebastianzabrzyski.domowabiblioteka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebastianzabrzyski.domowabiblioteka.model.User;

public interface UserRepository extends JpaRepository <User, Integer> {
	
	User findByUsername(String username);
	
}
