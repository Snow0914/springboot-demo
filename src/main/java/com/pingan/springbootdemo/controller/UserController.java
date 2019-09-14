package com.pingan.springbootdemo.controller;

import com.pingan.springbootdemo.domain.User;
import com.pingan.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User hello(@PathVariable("id") Long id) {

        return userService.findById(id);
    }

    @GetMapping("/users/byName")
    public List<User> hello(String name) {

        return userService.findByName(name);
    }

    @GetMapping("/users/add")
    public User hello(User user) {
        userService.addUser(user);
        return user;
    }

}
