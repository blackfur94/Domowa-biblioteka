package com.sebastianzabrzyski.domowabiblioteka.repository;

import org.springframework.data.repository.CrudRepository;
import com.sebastianzabrzyski.domowabiblioteka.model.Book;

public interface BookRepository extends CrudRepository <Book, Integer> {

}
