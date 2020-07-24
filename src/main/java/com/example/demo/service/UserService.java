package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.bean.UserDetails;


@Service
public interface UserService {

	public UserDetails getUserService(int id);
	public int insertUserService(UserDetails user);
	public List<UserDetails> getAllUsersService();
	
}
