package com.vodafone.boot.SpringBootDBDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vodafone.boot.SpringBootDBDemo.database.CustomerDB;
import com.vodafone.boot.SpringBootDBDemo.dto.CustomerDTO;
import com.vodafone.boot.SpringBootDBDemo.entity.Customer;
import com.vodafone.boot.SpringBootDBDemo.service.CustomerService;

/**
 * 1. Spring boot maven project as follows:
 * 		Go to start.spring.io => select maven, java 11/ 8, spring boot version 2.7.9
 * 		select jdbc, data-jpa, mysql and lombok as dependencies
 * 		Click on Generate and downloads the zip
 * 		Extract the zip and import as Maven Project in eclipse or STS
 * 2. Add DB connection parameters in application.properties file under src/main.resources folder
 * 3. Create Customer class and add JPA annotaitons
 * 4. Create interface CustomerRespoitory that extends CrudRepository
 * 5. Create CustomerService class and autowire the CustomerRespoitory
 * 6. Create methods for CRUD operations
 * 7. In main mehtod call the CustomerService class and test the methods
 * 
 * @author Shalini
 *
 */
@SpringBootApplication
public class SpringBootDbDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = 
		SpringApplication.run(SpringBootDbDemoApplication.class, args);
		System.out.println("hello world");
//		CustomerDB db = context.getBean(CustomerDB.class);
//		System.out.println(db.getCustomerCount());
		
		CustomerService service = context.getBean(CustomerService.class);
		System.out.println(service.getCustomerCount());
		
		Customer c = new Customer("manisha@yahoo.com", "7238909870", "manisha", "Pune", true);
		try {
			System.out.println(service.insertCustomer(c));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Customer c1 = service.getCustomerByEmail("mani@yahoo.com");
		
		c1.setCity("Mumbai");
		
		try {
			System.out.println(service.updateCustomer(c1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (CustomerDTO dto : service.getCustomers())
			System.out.println(dto);
		
		try {
			service.deleteCustomer(c.getEmail());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			System.out.println(service.insertCustomer(c));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
	}

}
