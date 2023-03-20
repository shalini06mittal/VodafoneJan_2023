package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.entity.Author;

/**
 *All the beans or java classes configured in spring.xml will be 
 *loaded and instantiated by spring
 *These classes are spring managed beans
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Author author = context.getBean(Author.class);
        System.out.println(author);
        
//        Author a1 = new Author(1, "", "");
//        a1.setAid(0);
    }
}
