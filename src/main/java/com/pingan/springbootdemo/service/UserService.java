package com.pingan.springbootdemo.service;

import com.pingan.springbootdemo.dao.UserRepository;
import com.pingan.springbootdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@CacheConfig(cacheNames = "users")
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Cacheable(key = "#p0")
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

//    @CacheEvict
    @CacheEvict(value="users", allEntries=true)
    public void addUser(User user) {
        userRepository.save(user);
    }

}
