package com.spring.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
  
 */
@SpringBootApplication
public class SpringWebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebDemoApplication.class, args);
	}

}
