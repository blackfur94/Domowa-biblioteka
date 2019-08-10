package com.sebastianzabrzyski.domowabiblioteka.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sebastianzabrzyski.domowabiblioteka.dto.UserRegistrationDto;
import com.sebastianzabrzyski.domowabiblioteka.model.User;
import com.sebastianzabrzyski.domowabiblioteka.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		return "login.html";
	}

	
	@GetMapping("/registration")
	public String showRegistrationForm(Model model) {
		return "registration.html";
	}
	
	@PostMapping("/registration")
	public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationDto userDto,
			BindingResult result) {
		
		User existing = userService.findByUsername(userDto.getUsername());
		 
		if (existing != null) {
			
			result.rejectValue("username", null, "Ten login jest juz zajety");
		}
		
		if(result.hasErrors()) {
			return "registration.html";
		}
		
		userService.save(userDto);
		return "redirect:/registration?success";
		
	}

}
