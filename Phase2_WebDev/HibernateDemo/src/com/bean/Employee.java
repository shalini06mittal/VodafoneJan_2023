package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private String email;
	private String ename;
	@OneToOne
	@JoinColumn(name="uniqueid")
	//@Column(name="uid")
	private UniqueIdentification uIdentification;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String email, UniqueIdentification uIdentification) {
		super();
		
		this.ename = ename;
		this.email = email;
		this.uIdentification = uIdentification;
	}

	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UniqueIdentification getuIdentification() {
		return uIdentification;
	}

	public void setuIdentification(UniqueIdentification uIdentification) {
		this.uIdentification = uIdentification;
	}

	@Override
	public String toString() {
		return "Employee [ ename=" + ename + ", email=" + email + ", uIdentification=" + uIdentification
				+ "]";
	}
	
}
