package com.generalinsurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generalinsurance.model.User;
import com.generalinsurance.service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public ResponseEntity<String> addUser(@RequestBody User user){
		
		userService.addUser(user);
		String body = "user saved with Id : " + user.getUserId();
		return ResponseEntity.ok(body);
	}
	
	@GetMapping("/AllUser")
	public List<User> allUser(){
		return userService.allUser();
	}
	@GetMapping("/UserById/{Id}")
	public User userById(@PathVariable Integer Id) {
		return userService.getUserById(Id);
	}
	@PutMapping("/UpdateUser")
	public User UpdateUser(@RequestBody User user) {
		return userService.updateUserById(user);
	}
	
	
	
}
