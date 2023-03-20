package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.core.band.Singer;
import com.spring.core.entity.Book;

import bean.Employee;

// similar to XML
@Configuration
// tells spring to scan for classes with spring annotations
// default it looks within the root and the subpackages of the root
@ComponentScan(basePackages = {"bean","com.spring.core"})
public class AppConfiguration 
{

    public static void main( String[] args )
    {
        ApplicationContext context =
        		new AnnotationConfigApplicationContext(AppConfiguration.class);
        
        Book book = context.getBean(Book.class);
        System.out.println(book);
        
        Employee emp = context.getBean(Employee.class);
        System.out.println(emp);
        
        Singer singer = context.getBean(Singer.class);
       singer.singing();

    }
}
/**
 * Create an interface Instrument => void play()
 * Create a class Violin and Guitar that implements the Instrument interface and 
 * provide the implementation of play() => Guitar playing
 *  
 *  Create a class Singer that has following members:
 *  String name
 *  Instrument instrument
 *  
 *  Constructor and setters and getters
 *  singing() => print the singer name and will call the play() of Instrument interface
 *  
 */
