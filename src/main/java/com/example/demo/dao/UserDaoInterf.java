package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.example.demo.bean.UserDetails;

@Repository
public interface UserDaoInterf {


	public UserDetails getUserDetail(int id);
	public int insertUser(UserDetails user);
	public List<UserDetails> getAllUserSDAO();
	
	
}
