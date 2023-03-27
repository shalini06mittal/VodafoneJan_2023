package com.spring.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="author")
public class Author {
	
	@Id
	@Column(name = "authorid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int aid;
	@Column(name="name")
	private String name;
	@Column(name="genre")
	private String genre;
	public Author() {
		// TODO Auto-generated constructor stub
	}
	public Author(int aid, String name, String genre) {
		super();
		this.aid = aid;
		this.name = name;
		this.genre = genre;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + ", genre=" + genre + "]";
	}
	
	

}
