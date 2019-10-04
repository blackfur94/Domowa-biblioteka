package com.sebastianzabrzyski.domowabiblioteka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebastianzabrzyski.domowabiblioteka.model.Book;
import com.sebastianzabrzyski.domowabiblioteka.model.User;
import com.sebastianzabrzyski.domowabiblioteka.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired 
	private BookRepository bookRepository;

	@Override
	public Optional<Book> findById(int bookId) {
        return bookRepository.findById(bookId);
	}

	


}
