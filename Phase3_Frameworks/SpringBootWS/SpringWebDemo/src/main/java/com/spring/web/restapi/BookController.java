package com.spring.web.restapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.web.entity.BookEntity;
import com.spring.web.repo.AuthorRepo;
import com.spring.web.repo.BookRepo;
import com.spring.web.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	
//	@GetMapping("/{id}")
//	public BookEntity getBookById(@PathVariable int id)
//	{
//		try {
//			return this.bookService.getBookById(id);
//		}
//		catch (Exception e)
//		{
//			return new BookEntity();
//		}
//	}
	@GetMapping("/{id}")
	public ResponseEntity<Map<String, Object>> getBookById(@PathVariable int id)
	{
		Map<String, Object> map = new HashMap<>();
		try {
			map.put("book",this.bookService.getBookById(id));
			return ResponseEntity.ok(map);
		}
		catch (Exception e)
		{
			map.put("error", e.getMessage());
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
		}
	}
	@GetMapping()
	public List<BookEntity> getAllBooks(@RequestParam(required = false) Integer authorid)
	{
		if(authorid == null)
			return this.bookService.getAllBooks();
		return this.bookService.getAllBooksByAuthor(authorid);
	}
}
