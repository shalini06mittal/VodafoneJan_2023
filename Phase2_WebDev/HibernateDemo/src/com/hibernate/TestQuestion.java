package com.hibernate;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Book;
import com.bean.Employee;
import com.bean.Question;
import com.bean.UniqueIdentification;
import com.bean.User;

public class TestQuestion {

	private static SessionFactory factory = HibernateConfig.getSessionFactory();

	public static void main(String[] args) {
		System.out.println("config loaded");

		Session session = factory.openSession();

		List<String> answers = Arrays.asList(
				"Java is OOPS language");
		
		List<String> answers1 = Arrays.asList(
				"HTML is browser's language",
				"HTML is hyper text markup language",
				"HTML is used to display content");

		List<User> users = new ArrayList<User>();
		User user1 = new User();
		user1.setUsername("Shalini");
		user1.setUserid(1);
		users.add(user1);

		User user2 = new User();
		user2.setUsername("Charles");
		user2.setUserid(2);
		users.add(user2);
		
		Question q1 = new Question();
		q1.setQname("What is HTML?");
		q1.setAnswers(answers1);
		q1.setUsers(users);
		
		Question q2 = new Question();
		q2.setQname("What is Java?");
		q2.setAnswers(answers);
		
		
//		session = factory.openSession();
//		
//		Transaction tx = session.beginTransaction();
//		session.save(user1);
//		session.save(user2);
//		session.save(q1);
//		
//		//session.save(q1);
//		tx.commit();
//		session.close();

	}


}







