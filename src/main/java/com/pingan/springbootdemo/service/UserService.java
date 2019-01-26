package com.pingan.springbootdemo.service;

import com.pingan.springbootdemo.dao.UserMapper;
import com.pingan.springbootdemo.dao.UserRepository;
import com.pingan.springbootdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@CacheConfig(cacheNames = "users")
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    @Cacheable(key = "#p0", unless = "result == null")
    public List<User> findByName(String name) {
        List<User> users = userRepository.findByName(name);
        return users;
    }

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    public User findById(Integer id) {
        User user = userMapper.selectById(id);
        return user;
    }

//    @CacheEvict
    @CacheEvict(value="users", allEntries=true)
    public void addUser(User user) {
        userRepository.save(user);
    }

}
