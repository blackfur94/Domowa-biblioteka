package com.sebastianzabrzyski.domowabiblioteka.service;

import java.util.List;
import java.util.Optional;

import com.sebastianzabrzyski.domowabiblioteka.model.Book;
import com.sebastianzabrzyski.domowabiblioteka.model.User;

public interface BookService {

	List<Book> findAllOfUser(User user);
	
	Optional<Book> findById(int bookId);

}
