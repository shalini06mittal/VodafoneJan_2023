package com.vodafone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vodafone.database.LoginDB;

// provides with Business logic -> validations, encryptions
@Service
public class LoginService {

	@Autowired
	private LoginDB loginDB;
	
	public boolean checkLogin(String email, String password) throws Exception
	{
		// decrypt password and then send to db
		return this.loginDB.validateCustomer(email, password);
	}
}
