package com.spring.web.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.web.entity.BookEntity;
import com.spring.web.repo.AuthorRepo;
import com.spring.web.repo.BookRepo;

@Service
public class BookService {

	@Autowired
	private BookRepo bookRepo;

	@Autowired
	private AuthorRepo authorRepo;

	public BookEntity getBookById(int id)
	{
		return bookRepo.findById(id)
				.orElseThrow(()-> new EntityNotFoundException("book with "+id+" not found"));
	}
	public List<BookEntity> getAllBooks()
	{
		List<BookEntity> books = new ArrayList<>();
		this.bookRepo.findAll().forEach(books::add);
		return books;
	}
	public List<BookEntity> getAllBooksByAuthor(int id)
	{
		List<BookEntity> books = new ArrayList<>();
		this.bookRepo.findBookByAuthorAid(id).forEach(books::add);
		return books;
	}
	public BookEntity addBook(BookEntity book)
	{
		if(this.bookRepo.existsById(book.getBookid()))
		{
			throw new EntityNotFoundException("book with "+book.getBookid()+" already exists");
		}
		return this.bookRepo.save(book);
	}
	public BookEntity updateBook(BookEntity book)
	{
		if(! this.bookRepo.existsById(book.getBookid()))
		{
			throw new EntityNotFoundException("book with "+book.getBookid()+" does not exist cannot update");
		}
		return this.bookRepo.save(book);
	}
	public boolean deleteBook(int bid)
	{
		if(! this.bookRepo.existsById(bid))
		{
			throw new EntityNotFoundException("book with "+bid+" cannot delete as it does not exist");
		}
		 this.bookRepo.deleteById(bid);
		 return true;
	}
}
