package com.generalinsurance.service;

import java.util.List;

import com.generalinsurance.model.User;


public interface UserService {
	
	public void addUser(User user);
	public User updateUserById(User user);
	public User getUserById(Integer id);
	public List<User> allUser();
	
	
}
