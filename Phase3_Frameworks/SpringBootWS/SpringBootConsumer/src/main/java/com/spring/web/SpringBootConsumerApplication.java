package com.spring.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConsumerApplication.class, args);
		
		RestTemplate template = new RestTemplate();
		
		String data = template.getForObject("http://localhost:8081/rest", String.class);
		System.out.println(data);
	}

}
