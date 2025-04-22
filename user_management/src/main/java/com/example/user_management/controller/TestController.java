package com.example.user_management.controller;

import com.example.user_management.entity.User;
import com.example.user_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/hello")
    public String hello() {
       return "Hello there!";
    }

    @PostMapping(path = "/user")
    public User createUser(User user) {
        userRepository.save(user);
        return user;
    }
}
