package com.sebastianzabrzyski.domowabiblioteka.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="title")
	@Size(min=1, message="Tytuł nie może być pusty")
	private String title;
	
	@Size(min=1, message="Autor nie może być pusty")
	@Column(name="author")
	private String author;
	
	@Min(1)
	@Column(name="release_year")
	private int releaseYear;
	
	@Size(min=1, message="Gatunek nie może być pusty")
	@Column(name="genre")
	private String genre;
	
	@Min(1)
	@Column(name="pages")
	private int pages;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
							CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="user_id")
	private User user;
	

	public Book() {
		
	}

	public Book(String title, String author, int releaseYear, String isRead, String genre,
			String coverLink, String user_id, int pages, User user) {
		super();
		this.title = title;
		this.author = author;
		this.releaseYear = releaseYear;
		this.genre = genre;
		this.user = user;
		this.pages = pages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	
	

}
