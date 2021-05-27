package com.pingan.springbootdemo.service;

import com.pingan.springbootdemo.dao.UserRepository;
import com.pingan.springbootdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@CacheConfig(cacheNames = "users")
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

//    @Cacheable(key = "#root.methodName.concat(#name)")
//    @Transactional(rollbackFor = Exception.class, isolation = Isolation.READ_COMMITTED)
    public List<User> findByName(String name) {
//        int i = 1/0;
        return userRepository.findByName(name);
    }

    @Cacheable(key = "#root.methodName.concat(#id)")
    public User findById(Long id) {
        User user = userRepository.findById(id);
        return user;
    }

//    @CacheEvict
    @CacheEvict(value="users", allEntries=true)
    @Transactional(rollbackFor = Exception.class, isolation = Isolation.REPEATABLE_READ)
    public void addUser(User user) {
        userRepository.save(user);
        System.out.println(findByName(user.getName()));
    }
}
