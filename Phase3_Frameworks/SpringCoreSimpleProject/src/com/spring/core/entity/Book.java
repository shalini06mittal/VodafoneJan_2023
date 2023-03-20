package com.spring.core.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Component
public class Book {
	
	@Value("201")
	private int bid;
	@Value("HTML5")
	private String title;
	@Value("510")
	private double price;
	@Autowired
	private Author author;
	

}
