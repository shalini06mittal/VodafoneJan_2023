package com.spring.core.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Component
public class Author {

	@Value("131")
	private int aid;
	@Value("Kathy Sierra")
	private String aname;
	@Value("IT")
	private String genre;
	
}
