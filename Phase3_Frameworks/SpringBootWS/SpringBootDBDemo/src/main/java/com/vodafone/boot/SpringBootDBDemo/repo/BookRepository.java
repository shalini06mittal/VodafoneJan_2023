package com.vodafone.boot.SpringBootDBDemo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.vodafone.boot.SpringBootDBDemo.entity.Book;


public interface BookRepository extends CrudRepository<Book	, Integer>{

	List<Book> findByAuthorAid(int aid);

}
