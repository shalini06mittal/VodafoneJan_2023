package com.vodafone.boot.SpringBootDBDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vodafone.boot.SpringBootDBDemo.entity.Book;
import com.vodafone.boot.SpringBootDBDemo.repo.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> findBooksByAuthor(int aid)
	{
		return bookRepository.findByAuthorAid(aid);
	}

}
