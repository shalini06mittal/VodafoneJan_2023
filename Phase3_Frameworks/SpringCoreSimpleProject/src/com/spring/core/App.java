package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.entity.Author;
import com.spring.core.entity.Book;

/**
 *All the beans or java classes configured in spring.xml will be 
 *loaded and instantiated by spring
 *These classes are spring managed beans
 *
 */
public class App 
{
	//https://projectlombok.org/download
	//https://projectlombok.org/setup/eclipse
	
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Author author = context.getBean(Author.class);
        // spring creates a single instance of the author object
        // scoping in spring => singleton
        Author author = (Author) context.getBean("a1");
        System.out.println(author.getAname());
        
        Author author1 = (Author) context.getBean("a1");
        System.out.println(author1.getAname());
        
        author.setAname("Roseline");
        
        System.out.println(author.getAname());
        System.out.println(author1.getAname());
        
        
        Book book = context.getBean(Book.class);
        System.out.println(book);
        
        
        
//        Author a1 = new Author(1, "", "");
//        a1.setAid(0);
    }
}
