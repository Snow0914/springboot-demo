package com.pingan.springbootdemo.controller;

import com.pingan.springbootdemo.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Map<String, Object> hello() {
        Map<String, Object> map = new HashMap<>();
        map.put("date", new UserDto(1L, new Date()));

        return map;
    }

//    @Autowired
//    private RestTemplate restTemplate;


    @RequestMapping("/hi")
    public String callHone() {
//        Log.log(Level.INFO, "calling trace service-hi  ");
//        return restTemplate.getForObject("http://localhost:8080/hello", String.class);
        return null;
    }
}
