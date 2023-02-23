package com.bean;

import javax.persistence.Embeddable;

@Embeddable
public class Email {

	
	private String emailid;
	
	public Email() {
		// TODO Auto-generated constructor stub
	}

	
	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
}
