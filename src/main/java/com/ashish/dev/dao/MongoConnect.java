package com.ashish.dev.dao;

import com.ashish.dev.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoConnect extends MongoRepository<UserModel, String> {
}
