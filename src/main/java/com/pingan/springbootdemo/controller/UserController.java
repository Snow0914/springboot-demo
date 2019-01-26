package com.pingan.springbootdemo.controller;

import com.pingan.springbootdemo.domain.User;
import com.pingan.springbootdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.TimeZone;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable("id") Integer id) {
        log.info("time zone is : {}", TimeZone.getDefault().getDisplayName());
        User user = userService.findById(id);
        log.info("user : {}", user);
        return user;
    }

    @GetMapping("/users/name/{name}")
    public List<User> findByName(@PathVariable("name") String name) {
        List<User> users = userService.findByName(name);
        return users;
    }

    @GetMapping("/users/add")
    public User hello(User user) {
        userService.addUser(user);
        return user;
    }

}
