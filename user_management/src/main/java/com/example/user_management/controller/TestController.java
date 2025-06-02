package com.example.user_management.controller;

import com.example.user_management.domain.dto.request.CreateUserReqDto;
import com.example.user_management.entity.User;
import com.example.user_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/hello")
    public String hello() {
       return "Hello there!";
    }

    @PostMapping(path = "/user", produces = "application/json")
    public User createUser(@RequestBody CreateUserReqDto dto) {
        User u = new User();
        u.setFirstname(dto.getFirstname());
        u.setLastname(dto.getLastname());
        u.setUsername(dto.getUsername());
        u.setPhone(dto.getPhone());
        u.setPassword(dto.getPassword());
        return userRepository.save(u);
    }
}
