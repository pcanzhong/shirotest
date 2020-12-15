package com.shirotest.demo.service;

import com.shirotest.demo.mapper.UserMapper;
import com.shirotest.demo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(String name){
        return userMapper.Sel(name);
    }
}
