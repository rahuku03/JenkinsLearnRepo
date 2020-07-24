package com.example.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.bean.UserDetails;


@Repository
public class UserDao implements UserDaoInterf {

	private static Map<Integer,UserDetails> users=new HashMap<>();
	private int counter=3;
	
	public UserDao() {
	    UserDetails user1=new UserDetails();
		user1.setId(1);
		user1.setAddress("Pune");
		user1.setEmail("Rahul.kumar@india.com");
		user1.setName("Rahul");
		
		UserDetails user2=new UserDetails();
		user2.setId(2);
		user2.setAddress("Mumbai");
		user2.setEmail("Amit.kumar@india.com");
		user2.setName("Amit");
		 
		
		users.put(user1.getId(),user1);
		users.put(user2.getId(),user2);
		
	}
	
	public UserDetails getUserDetail(int id) {

		UserDetails user=users.get(id);
		
		return user;
	}
	
	
	public int insertUser(UserDetails user) {
		
	
		user.setId(counter);
		users.put(counter, user);
		counter++;
		return user.getId();
		
	}
	
	public List<UserDetails> getAllUserSDAO(){
		return new ArrayList<UserDetails>(users.values());
	}
	
}
