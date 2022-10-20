package com.generalinsurance.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generalinsurance.model.User;
import com.generalinsurance.repository.UserRegistrationRepository;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
	
	@Autowired
	private UserRegistrationRepository userRepo;
	
	@Override
	public User addUser(User user) {
		return userRepo.save(user);
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

	@Override
	public User fetchUserByEmailId(String email) {
		return userRepo.findByEmail(email);
	}

	@Override
	public User fetchUserByEmailAndPassword(String tempEmail, String tempPass) {
		return userRepo.findByEmailAndPassword(tempEmail,tempPass);
		
	}

}
