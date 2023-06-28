package com.spring.web.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.web.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, String>{

}
