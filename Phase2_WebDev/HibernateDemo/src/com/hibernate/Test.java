package com.hibernate;



import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Book;

public class Test {

	private static SessionFactory factory = HibernateConfig.getSessionFactory();
	
	public static void main(String[] args) {
		System.out.println("config loaded");
		Book b1 = new Book();
		b1.setAuthor("Shalini Mittal");
		b1.setBooktitle("HTML5");
		b1.setPrice(550);
		b1.setYear(2004);
		//b1.setBid(2);
		//System.out.println(saveBook(b1));
//		System.out.println(getBookById(1));
//		System.out.println();
//		System.out.println(getBookById(2));
		
//		System.out.println("\n********* LOAD **********\n");
//		Book book = loadBookById(1);
//		System.out.println(book.getBid());
//		System.out.println(book.getAuthor());
		//updateBook(b1);
		//deleteBook(b1);
//		for(Book b:getAllBooks())
//			System.out.println(b);
	}
	public static Book loadBookById(int id)
	{
		Session session = factory.openSession();
		Book book = session.load(Book.class, id);
		System.out.println(book);
		session.close();
		return book;
	}
	
	public static Integer saveBook(Book book) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer) session.save(book);
		tx.commit();
		session.close();
		return id;
	}
	public static Book getBookById(int id)
	{
		Session session = factory.openSession();
		Book book = session.get(Book.class, id);
		session.close();
		return book;
	}
	/**
	 * get -> will make physical connection to the db and return the object
	 * or null if it doesnt exists
	 * 
	 * load -> will not make any physical connection to the db and throws an
	 * exception if record is not persisted or doesnt exist
	 * 
	 * 3 states of object
	 * 
	 * 1. transient => new and assign values to the object
	 * 2. persistent => save()
	 * 3. detached state when the session is closed
	 * @param id
	 * @return
	 */
	
	public static void updateBook(Book book) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(book);
		tx.commit();
		session.close();

	}
	
	public static void deleteBook(Book book) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(book);
		tx.commit();
		session.close();

	}
	
	public static List<Book> getAllBooks()
	{
		Session session = factory.openSession();
		CriteriaQuery<Book> cq = session.getCriteriaBuilder().createQuery(Book.class);
		cq.from(Book.class);
		List<Book> booklist = session.createQuery(cq).getResultList();
		return booklist;
	}


}







