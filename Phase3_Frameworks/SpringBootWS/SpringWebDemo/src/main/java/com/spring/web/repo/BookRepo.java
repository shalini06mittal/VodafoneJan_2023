package com.spring.web.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.web.entity.Author;
import com.spring.web.entity.BookEntity;

public interface BookRepo extends CrudRepository<BookEntity, Integer>{

	public List<BookEntity> findBookByAuthorAid(int aid);
}

