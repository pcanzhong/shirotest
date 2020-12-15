package com.shirotest.demo.controller;

import com.shirotest.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser/{name}")
    public String GetUser(@PathVariable String name){
        return userService.Sel(name).toString();
    }
    @GetMapping("/")
    public String test(){
        System.out.println("111");
        return "111";
    }

}
