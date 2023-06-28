package com.spring.web.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.web.entity.Author;

public interface AuthorRepo extends CrudRepository<Author, Integer>{

}
