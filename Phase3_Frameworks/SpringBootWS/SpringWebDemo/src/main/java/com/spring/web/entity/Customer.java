package com.spring.web.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name="customer")
public class Customer {

	@Id
	private String email;
	private String phone;
	private String password;
	private String city;
	private boolean ismember;
}
