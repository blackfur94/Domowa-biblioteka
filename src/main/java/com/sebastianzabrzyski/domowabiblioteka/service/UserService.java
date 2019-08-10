package com.sebastianzabrzyski.domowabiblioteka.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sebastianzabrzyski.domowabiblioteka.dto.UserRegistrationDto;
import com.sebastianzabrzyski.domowabiblioteka.model.User;

public interface UserService extends UserDetailsService{

	
	User save(UserRegistrationDto registration);

	User findByUsername(String username);

}
