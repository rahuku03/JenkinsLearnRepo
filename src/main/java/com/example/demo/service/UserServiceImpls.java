package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.UserDetails;
import com.example.demo.dao.UserDaoInterf;


@Service
public class UserServiceImpls implements UserService{
	
	@Autowired
	private UserDaoInterf userDao;

	public UserDetails getUserService(int id) {
		
		return userDao.getUserDetail(id);
		
	}
	
	public int insertUserService(UserDetails user) {
		
		return userDao.insertUser(user);
		
	}
	public List<UserDetails> getAllUsersService(){
		return userDao.getAllUserSDAO();
	}
}
