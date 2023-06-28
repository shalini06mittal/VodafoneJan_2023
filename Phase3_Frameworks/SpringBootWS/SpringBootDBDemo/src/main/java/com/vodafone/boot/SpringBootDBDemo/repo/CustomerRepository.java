package com.vodafone.boot.SpringBootDBDemo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.vodafone.boot.SpringBootDBDemo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer	, String>{

	Optional<Customer> findByPhone(String phone);
	List<Customer> findByIsmemberTrue();
	
}
