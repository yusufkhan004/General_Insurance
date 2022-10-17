package com.generalinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generalinsurance.model.User;
import com.generalinsurance.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void addUser(User user) {
		userRepo.save(user);
	}

	@Override
	public User updateUserById(User user) {
		  return userRepo.save(user);
//		if(userRepo.findById(id).isPresent()) {
//			return userRepo.save(user);
//		}
//		else {
//			throw new InvalidRequestException("User with ID " + 
//        			user.getId() + " does not exist.");
//		}	
	}

	@Override
	public User getUserById(Integer id) {
		User user = userRepo.findById(id).get();
		return user;
	}

	@Override
	public List<User> allUser() {
		List<User> users =  userRepo.findAll();
		return users;
	}

}
