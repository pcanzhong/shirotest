package com.shirotest.demo.service;

import com.shirotest.demo.vo.Role;
import com.shirotest.demo.vo.User;

public interface LoginService {
    User addUser(User user);
    Role addRole(Role role);
    User findByName(String name);
}
