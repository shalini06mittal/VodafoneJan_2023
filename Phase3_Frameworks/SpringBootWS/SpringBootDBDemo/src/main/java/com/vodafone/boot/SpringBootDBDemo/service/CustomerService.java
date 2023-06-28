package com.vodafone.boot.SpringBootDBDemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vodafone.boot.SpringBootDBDemo.dto.CustomerDTO;
import com.vodafone.boot.SpringBootDBDemo.entity.Customer;
import com.vodafone.boot.SpringBootDBDemo.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	

	public long getCustomerCount()
	{
		return repo.count();
	}

	public Customer insertCustomer(Customer customer) throws Exception
	{
		if(this.repo.existsById(customer.getEmail()))
			throw new Exception(customer.getEmail()+ " already exists");
		return this.repo.save(customer);
		
	}
	public Customer updateCustomer(Customer customer) throws Exception
	{
		if(!this.repo.existsById(customer.getEmail()))
			throw new Exception(customer.getEmail()+ " does not exist and cannot update");
		return this.repo.save(customer);
	}
	public void deleteCustomer(String email) throws Exception
	{
		if(!this.repo.existsById(email))
			throw new Exception(email+ " does not exist and cannot delete");
		this.repo.deleteById(email);;
	}
	public Customer getCustomerByEmail(String email)
	{
		return this.repo.findById(email)
				.orElseThrow(()-> new EntityNotFoundException(email+ " does not exist"));
	}
	
	public Customer getCustomerByPhone(String phone)
	{
		return this.repo.findByPhone(phone)
				.orElseThrow(()-> new EntityNotFoundException(phone+ " does not exist"));
	}
	public List<Customer> getAllCustomerWhoAreMembers()
	{
		
		return this.repo.findByIsmemberTrue();
	}
	
	public List<CustomerDTO> getCustomers()
	{
		List<CustomerDTO> customers = new ArrayList<>();
		this.repo.findAll().forEach(customer -> {
			CustomerDTO dto = new CustomerDTO();
			dto.setCity(customer.getCity());
			dto.setEmail(customer.getEmail());
			dto.setMember(customer.isIsmember());
			dto.setPhone(customer.getPhone());
			customers.add(dto);
		});
		return customers;
	}

}
