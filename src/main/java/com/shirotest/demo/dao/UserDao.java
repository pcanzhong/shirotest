package com.shirotest.demo.dao;

import com.shirotest.demo.vo.User;

public interface UserDao {
    User findByName(String name);
}
