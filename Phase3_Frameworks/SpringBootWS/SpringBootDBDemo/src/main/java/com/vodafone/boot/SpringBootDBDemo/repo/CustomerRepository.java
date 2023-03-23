package com.vodafone.boot.SpringBootDBDemo.repo;

import org.springframework.data.repository.CrudRepository;

import com.vodafone.boot.SpringBootDBDemo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer	, String>{

}
