package com.hibernate;



import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Book;
import com.bean.Employee;
import com.bean.UniqueIdentification;

public class TestEmployee {

	private static SessionFactory factory = HibernateConfig.getSessionFactory();
	
	public static void main(String[] args) {
		System.out.println("config loaded");
		UniqueIdentification ob1 = new UniqueIdentification(456, "2022-01-10", "USA");
		Employee e1 = new Employee(2, "Maya", "maya@gmail.com", ob1);
		
		Session session = factory.openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(ob1);
//		session.save(e1);
//		tx.commit();
//		
//		session.close();
//		
//		session = factory.openSession();
//		Employee emp = session.get(Employee.class, "shalini@gmail.com");
//		session.close();
//		
//		System.out.println(emp.getEmail());
//		System.out.println(emp.getEname());
//		System.out.println(emp.getuIdentification());
		
		session = factory.openSession();
		UniqueIdentification ob2 = session.get(UniqueIdentification.class, 1);
		session.close();
		
		System.out.println(ob2.getCountry());
		System.out.println(ob2.getEmployee());
		
	}


}







