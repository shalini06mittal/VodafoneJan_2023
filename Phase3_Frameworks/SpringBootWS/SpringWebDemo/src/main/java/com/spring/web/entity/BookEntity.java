package com.spring.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="book_entity")
public class BookEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookid;
	private String booktitle;
	@OneToOne
	@JoinColumn(name="authorid")
	private Author author;
	private double price;
	@Column(name="year_of_pub")
	private int year;
	
	public BookEntity() {
		// TODO Auto-generated constructor stub
	}

	public BookEntity(int bookid, String booktitle, Author author, double price) {
		super();
		this.bookid = bookid;
		this.booktitle = booktitle;
		this.author = author;
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookEntity [bookid=" + bookid + ", booktitle=" + booktitle + ", author=" + author + ", price=" + price
				+ ", year=" + year + "]";
	}

	
	
	
}
