package com.batuhanaslan.springmongorestapi.repository;

import com.batuhanaslan.springmongorestapi.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
