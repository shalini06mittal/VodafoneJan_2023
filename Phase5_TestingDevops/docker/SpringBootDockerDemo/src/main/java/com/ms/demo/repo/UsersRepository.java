package com.ms.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ms.demo.model.Users;

public interface UsersRepository extends MongoRepository<Users, Integer> {

}
