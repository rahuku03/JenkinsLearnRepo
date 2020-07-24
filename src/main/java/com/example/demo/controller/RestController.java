package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.UserDetails;
import com.example.demo.service.UserService;

@org.springframework.web.bind.annotation.RestController	
public class RestController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/Users/{id}",method =RequestMethod.GET,produces = MediaType.APPLICATION_XML_VALUE)
	public UserDetails getUserById(@PathVariable int id) {
		
		return userService.getUserService(id);
		
	}

	@PostMapping("/Users")
	public int insertUserDetails(@RequestBody UserDetails user) {
		
		return userService.insertUserService(user);
	}
	
	@GetMapping("/Users")
	public List<UserDetails> getAllUsersDetails(){
		return userService.getAllUsersService();
	}
	
}
