package com.ashish.dev.services;

import com.ashish.dev.dao.MongoConnect;
import com.ashish.dev.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    MongoConnect connect;

    public void saveUser(UserModel userModel){
        connect.save(userModel);
    }
}
