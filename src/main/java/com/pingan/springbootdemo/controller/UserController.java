package com.pingan.springbootdemo.controller;

import com.pingan.springbootdemo.domain.User;
import com.pingan.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{name}")
    public User hello(@PathVariable("name") String name) {

        return userService.findByName(name);
    }

    @GetMapping("/users/add")
    public User hello(User user) {
        userService.addUser(user);
        return user;
    }

}
