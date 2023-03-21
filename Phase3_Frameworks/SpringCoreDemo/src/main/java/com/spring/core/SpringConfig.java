package com.spring.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.core.entity.Author;

@Configuration
public class SpringConfig {

	// can be used only on the methods
	@Bean("author")
	public Author createAuthor()
	{
		System.out.println("author bean created and injected");
		return new Author(121, "Head First", "IT");
	}
	@Bean
	public List<String> getCategories()
	{
		return Arrays.asList("Bakery","Dairy","Vegetables");
	}
	
	@Bean
	public Set<Integer> getIds()
	{
		return new HashSet<Integer>(Arrays.asList(1,2,3,4));
	}
	@Bean
	@Autowired
	public List<Author> getAuthors()
	{
		return Arrays.asList(new Author(1, "Temp name", "Thriller"));
	}
	@Bean
	public Map<String, Integer> map()
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Key1", 1);
		map.put("Key2", 2);
		map.put("Key3", 3);
		map.put("Key4", 4);
		return map;
	}
	
	
}
