package com.spring.jdbc.SpringJdbcMavenDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.SpringJdbcMavenDemo.database.CustomerDB;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context 
        = new AnnotationConfigApplicationContext(DbConfig.class);
        
        CustomerDB db = context.getBean(CustomerDB.class);
        System.out.println(db.getCustomerCount());
    }
}
