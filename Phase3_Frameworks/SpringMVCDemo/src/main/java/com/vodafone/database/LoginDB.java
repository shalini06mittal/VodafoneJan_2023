package com.vodafone.database;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
// when connecting with database and perfoming CRUD operations
@Repository
public class LoginDB {

	@Autowired
	private JdbcTemplate template;

	public boolean validateCustomer(String email, String password) throws Exception
	{
		String sql = "select password from customer where email=?";
		String pwd = null;
		try {
			pwd = template.queryForObject(sql, String.class, email);
		}catch(Exception e)
		{
			System.out.println("main exception");
			throw new Exception("Invalid email");
		}
		System.out.println(pwd);
		if(pwd == null)
			throw new Exception("Invalid email");
		else {
			if(pwd.equals(password))
				return true;
			else {
				System.out.println("pwd not match");
				throw new Exception("Invalid password");
			}
		}
	}
}
