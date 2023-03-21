package com.spring.jdbc.SpringJdbcMavenDemo.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.SpringJdbcMavenDemo.entity.Customer;

@Repository
public class CustomerDB {

	@Autowired
	private JdbcTemplate template;
	
	public long getCustomerCount()
	{
		String sql = "select count(*) from customer";
		return template.queryForObject(sql, Long.class);
	}
	
	public boolean insertCustomer(Customer customer)
	{
		String sql = "insert into customer values(?,?,?,?,?)";
		try {
			template.update(sql, customer.getEmail(), customer.getPhone(),
					customer.getPassword(), customer.getCity(), customer.isMember()
					);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		return true;
		
	}
	
	public boolean updateCustomer(String phone, String city, String email)
	{
		String sql = "update customer set phone=?, city=? where email=?";
		try {
			template.update(sql, phone, city, email);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		return true;
		
	}
	
	public boolean deleteCustomer(String email)
	{
		String sql = "delete from customer where email=?";
		try {
			template.update(sql, email);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		return true;
		
	}
	
}
