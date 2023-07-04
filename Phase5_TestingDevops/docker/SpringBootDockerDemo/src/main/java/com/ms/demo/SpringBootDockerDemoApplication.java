package com.ms.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// As we will be running our MongoDB instance as a separate container hence our host will be ‘host.docker.internal‘ via which we will access the application container will access MongoDB service on another container.
@SpringBootApplication
public class SpringBootDockerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerDemoApplication.class, args);
	}

}
