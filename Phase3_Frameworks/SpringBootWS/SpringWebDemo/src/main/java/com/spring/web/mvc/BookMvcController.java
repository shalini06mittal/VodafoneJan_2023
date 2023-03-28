package com.spring.web.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.web.entity.BookEntity;
import com.spring.web.repo.AuthorRepo;
import com.spring.web.service.BookService;

@Controller
@RequestMapping("/mvc/books")
public class BookMvcController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired 
	private AuthorRepo repo;
	
	@GetMapping
	public String viewBooksPage(Map<String, List<Integer>> map){
		
		List<Integer> authorids = new ArrayList<>(); 
		this.repo.findAll().forEach(author -> authorids.add(author.getAid()));
		map.put("ids", authorids);
		return "books";
	}
	@GetMapping("/author")
	public String getAllBooks(Map<String, List<BookEntity>> map,
		@RequestParam int authorid,
		Map<String, List<Integer>> mapids
			){
		
		List<Integer> authorids = new ArrayList<>(); 
		this.repo.findAll().forEach(author -> authorids.add(author.getAid()));
		mapids.put("ids", authorids);
		
		List<BookEntity> books = this.bookService.getAllBooksByAuthor(authorid);
		map.put("books", books);
		System.out.println(books.size());
		return "books";
	}

}
