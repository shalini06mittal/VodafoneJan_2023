package com.ms.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.ms.demo.model.Users;
import com.ms.demo.repo.UsersRepository;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoConfig {

	
	 @Bean
	    CommandLineRunner commandLineRunner(UsersRepository userRepository) {
	        return strings -> {
	            userRepository.save(new Users(1, "Calvin", "Ryan"));
	            userRepository.save(new Users(2, "Bryson", "Reid"));
	        };
	    }
}
