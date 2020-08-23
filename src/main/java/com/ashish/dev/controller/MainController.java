package com.ashish.dev.controller;

import com.ashish.dev.dao.MongoConnect;
import com.ashish.dev.model.UserModel;
import com.ashish.dev.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @GetMapping("/test")
    public String healthcheck() {
        return "It Works";
    }

    @GetMapping("/hello/{name}")
    public String helloworld(@PathVariable String name) {
        return "Hello, "+name+" I'm, running on Java SpringBoot";
    }

    @Autowired
    UserServices service;

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserModel user) {
        service.saveUser(user);
        return "User Added Successfully";
    }
}
