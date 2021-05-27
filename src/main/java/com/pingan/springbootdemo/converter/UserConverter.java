package com.pingan.springbootdemo.converter;

import com.pingan.springbootdemo.domain.User;
import com.pingan.springbootdemo.dto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConverter {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    UserDto convert(User userDO);
}
