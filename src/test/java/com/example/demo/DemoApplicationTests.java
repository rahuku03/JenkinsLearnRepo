package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.bean.UserDetails;
import com.example.demo.service.UserService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private UserService userService;
	
	
	
	@Test
	void GetUserServiceTest() {
		
		UserDetails detail=userService.getUserService(3);
		assertThat(detail.getId()).isNotNull();
		
	}

}
