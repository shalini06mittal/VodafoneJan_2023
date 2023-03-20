package com.spring.core;

public class Author {


	private int aid;
	private String aname;
	private String genre;
	
	public Author() {
		System.out.println("Author default constructor");
	}

	public Author(int aid, 
			String aname, 
			String genre) {
		System.out.println("Author parameterized constructor");
		this.aid = aid;
		this.aname = aname;
		this.genre = genre;
	}

	public int getAid() {
		return aid;
	}

	
	public void setAid(int id) {
		System.out.println("set author id");
		this.aid = id;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + ", genre=" + genre + "]";
	}
	
}
