package com.geekjc.springmybatisgenerator;

import com.geekjc.springmybatisgenerator.dao.UserMapper;
import com.geekjc.springmybatisgenerator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringMybatisGeneratorApplication {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisGeneratorApplication.class, args);
    }

}
