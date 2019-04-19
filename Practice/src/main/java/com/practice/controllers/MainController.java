package com.practice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.UserEntity;
import com.practice.service.UserService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class MainController {
	
	@Autowired
	UserService userService;

	
	@GetMapping("fetchAllUsers")
	public List<UserEntity> getAll() {
		return userService.getAll();
	}
	
	@GetMapping("fetchUserDetail/{userID}")
	public Optional<UserEntity> getAnUser(@PathVariable(value = "userID") Long userID) {
		
		return userService.getUserEntity(userID);
		
	}
	
	@PostMapping("saveUser")
	public UserEntity saveUser(@RequestBody UserEntity userEntity) {
		System.out.println(userEntity);
		userService.saveUser(userEntity);
		return userEntity;
	}
	
}
