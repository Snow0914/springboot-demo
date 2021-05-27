package com.pingan.springbootdemo.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserServiceFeignClient02 {

    // 获得用户详情
    @GetMapping("/user/get")
    String get(@RequestParam("id") Integer id);

}