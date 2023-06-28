package com.spring.web.restapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.web.entity.BookEntity;
import com.spring.web.service.BookService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = {"http://127.0.0.1:5500"})
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

//	@GetMapping("/{id}")
//	public ResponseEntity<Map<String, Object>> getBookById(@PathVariable int id)
//	{
//		Map<String, Object> map = new HashMap<>();
//		try {
//			map.put("book",this.bookService.getBookById(id));
//			return ResponseEntity.ok(map);
//		}
//		catch (Exception e)
//		{
//			map.put("error", e.getMessage());
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
//		}
//	}
	@GetMapping("/{id}")
	@Operation(summary = "Returns a book json when id passed")
	@ApiResponses(value= {
			@ApiResponse(responseCode = "200", description = "Book Found"),
			@ApiResponse(responseCode = "400", description = "Book not Found"),
	})
	public ResponseEntity<Map<String, Object>> getBookById(@PathVariable int id)
	{
		Map<String, Object> map = new HashMap<>();
		
			map.put("book",this.bookService.getBookById(id));
			return ResponseEntity.ok(map);
	}
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	@Operation(summary = "Returns list of books as json or xml.Author id is optional if passed will return all bokk byt the authir id")
	public List<BookEntity> getAllBooks(@RequestParam(required = false) Integer authorid)
	{
		if(authorid == null)
			return this.bookService.getAllBooks();
		return this.bookService.getAllBooksByAuthor(authorid);
	}
	@PostMapping(consumes = MediaType.APPLICATION_XML_VALUE, 
			produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE} )
	public ResponseEntity<Map<String, Object>> insertBook(@RequestBody BookEntity book)
	{
		System.out.println(book);
		Map<String, Object> map = new HashMap<>();
			map.put("book",this.bookService.addBook(book));
			return ResponseEntity.ok(map);
		
	}
}
