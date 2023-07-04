package com.ms.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.demo.model.Users;
import com.ms.demo.repo.UsersRepository;

@RestController
public class UsersController {

	  @Autowired
	    UsersRepository userRepository;
	    @GetMapping("/users")
	    public List<Users> list() {
	        return userRepository.findAll();
	    }
}
