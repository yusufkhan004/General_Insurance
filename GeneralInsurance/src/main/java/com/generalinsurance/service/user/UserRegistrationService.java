package com.generalinsurance.service.user;

import java.util.List;

import com.generalinsurance.model.User;


public interface UserRegistrationService {
	
	public User addUser(User user);
	public User updateUserById(User user);
	public User getUserById(Integer id);
	public List<User> allUser();
	public User fetchUserByEmailId(String tempEmail);
	public User fetchUserByEmailAndPassword(String tempEmail, String tempPass);
	
	
}
