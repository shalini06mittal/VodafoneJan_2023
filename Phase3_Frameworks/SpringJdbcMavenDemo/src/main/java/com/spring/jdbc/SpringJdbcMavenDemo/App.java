package com.spring.jdbc.SpringJdbcMavenDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.SpringJdbcMavenDemo.database.CustomerDB;
import com.spring.jdbc.SpringJdbcMavenDemo.entity.Customer;

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
        
        Customer c1 = new Customer("preeti@gmail.com", "1345672637","preeti","pune",true);
//        System.out.println(db.insertCustomer(c1));
//        System.out.println(db.insertCustomer(c1));
        
        c1.setCity("Chennai");
        System.out.println(db.updateCustomer("89765456678", c1.getCity(), c1.getEmail()));
        
        System.out.println(db.deleteCustomer(c1.getEmail()));
    }
}
