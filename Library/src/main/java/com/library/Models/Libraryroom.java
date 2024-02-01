package com.library.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Libraryroom {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookid;

	private String bookName;

	private String author;

	private Double rating;

	public Libraryroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Libraryroom(Integer bookid, String bookName, String author, Double rating) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.author = author;
		this.rating = rating;
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Libraryroom [bookid=" + bookid + ", bookName=" + bookName + ", author=" + author + ", rating=" + rating
				+ "]";
	}

}
