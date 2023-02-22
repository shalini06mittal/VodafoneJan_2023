package com.bean;

public class Book {

	private int bid;
	private String booktitle;
	private String author;
	private double price;
	private int year;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bid, String booktitle, String author, double price) {
		super();
		this.bid = bid;
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

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
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
		return "Book [bid=" + bid + ", title=" + booktitle + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
