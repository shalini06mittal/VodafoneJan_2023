package com.spring.jdbc.SpringJdbcMavenDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Customer {

	private String email;
	private String phone;
	private String password;
	private String city;
	private boolean isMember;
}
