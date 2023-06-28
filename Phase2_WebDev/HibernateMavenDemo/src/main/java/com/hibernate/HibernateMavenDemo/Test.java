package com.hibernate.HibernateMavenDemo;

import org.hibernate.SessionFactory;

public class Test {

	private static SessionFactory factory = HibernateConfig.getSessionFactory();
	
	public static void main(String[] args) {
		System.out.println("config loaded");

	}

}
