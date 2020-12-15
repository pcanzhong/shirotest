package com.shirotest.demo.mapper;

import com.shirotest.demo.vo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(String name);
}
