package com.spring.jdbc.SpringJdbcMavenDemo.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.SpringJdbcMavenDemo.dto.CustomerDTO;
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
	
	public CustomerDTO getCustomerByEmail(String email)
	{
		String sql = "select email, phone, city, ismember from customer where email=?";
		return template.queryForObject(sql, new CustomerRowMapper(), email);
	}
	public List<CustomerDTO> getCustomers()
	{
		String sql = "select email, phone, city, ismember from customer";
		return template.query(sql, new CustomerRowMapper());
	}
	
	private class CustomerRowMapper implements RowMapper<CustomerDTO>
	{
		@Override
		public CustomerDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			CustomerDTO customer = new CustomerDTO();
			customer.setEmail(rs.getString(1));
			customer.setPhone(rs.getString(2));
			
			customer.setCity(rs.getString(3));
			customer.setMember(rs.getBoolean(4));
			return customer;
		}
	}
	
}
