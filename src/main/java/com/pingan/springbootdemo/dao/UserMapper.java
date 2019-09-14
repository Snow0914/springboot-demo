package com.pingan.springbootdemo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.pingan.springbootdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}