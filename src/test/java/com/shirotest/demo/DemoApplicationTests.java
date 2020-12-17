package com.shirotest.demo;

import com.shirotest.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
		System.out.println(userService.Sel("1"));
	}

}
