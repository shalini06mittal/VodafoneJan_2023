package com.vodafone.boot.SpringBootDBDemo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.vodafone.boot.SpringBootDBDemo.entity.Author;

public interface AuthorRepository extends CrudRepository<Author	, Integer>{

	
}
