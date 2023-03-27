package com.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.web.entity.Author;
import com.spring.web.entity.BookEntity;
import com.spring.web.entity.Customer;
import com.spring.web.repo.AuthorRepo;
import com.spring.web.repo.BookRepo;
import com.spring.web.repo.CustomerRepo;

/*
 * 1. create a spring boot project => packaging type as war
 * 2. add dependencies Devtools, Lombok, web h2, data jpa and 
 * <dependency>
   <groupId>org.apache.tomcat.embed</groupId>
   <artifactId>tomcat-embed-jasper</artifactId>
   <scope>provided</scope>
  </dependency>
  3. Configure application.properties for server port [ if you want to change the port ],
  and prefix and suffix for views if it is MVC application
  4. Add jsp files in the webapp folder
  5. Create controllers
  jdbc:h2:mem:f5c97764-11eb-4166-bbd9-676e34ef6656
  
  http://localhost:8081/h2-console/
 */
@SpringBootApplication
public class SpringWebDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringWebDemoApplication.class, args);
	}
	
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private AuthorRepo authorRepo;
	@Autowired
	private BookRepo bookRepo;
	
	@Bean
	public void setUp()
	{
		Customer c1 = new Customer("shalini@gmail.com", "8987654346", "shalini", "Mumbai", false);
		Customer c2 = new Customer("pavel@gmail.com", "35678289278", "pavel", "Pune", true);
		
		Author a1 = new Author(1, "James", "suspense");
		Author a2 = new Author(2, "Parul", "thriller");
		
		BookEntity b1 = new BookEntity(1, "Twilight", a1, 450);
		BookEntity b2 = new BookEntity(2, "2 days to go", a1, 980);
		BookEntity b3 = new BookEntity(3, "lets have fun", a2, 567);
		
		customerRepo.save(c1);
		customerRepo.save(c2);
		
		authorRepo.save(a1);
		authorRepo.save(a2);
		
		bookRepo.save(b1);
		bookRepo.save(b2);
		bookRepo.save(b3);
	}

}
