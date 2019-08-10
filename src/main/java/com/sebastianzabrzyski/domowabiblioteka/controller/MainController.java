package com.sebastianzabrzyski.domowabiblioteka.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sebastianzabrzyski.domowabiblioteka.model.Book;
import com.sebastianzabrzyski.domowabiblioteka.model.User;
import com.sebastianzabrzyski.domowabiblioteka.repository.BookRepository;
import com.sebastianzabrzyski.domowabiblioteka.repository.UserRepository;

@Controller
public class MainController {
	
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/")
	public String index(Model model, Principal principal) {
		
		String username = principal.getName();
		User user = userRepository.findByUsername(username);
		List<Book> books = user.getBooks();
		
		model.addAttribute("books", books);
		return "index.html";
		
	}


}
