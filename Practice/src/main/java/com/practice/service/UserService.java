package com.practice.service;

import java.util.List;
import java.util.Optional;

import com.practice.entity.UserEntity;

public interface UserService {
	
	public UserEntity saveUser(UserEntity userEntity);
	public List<UserEntity> getAll();
	public Optional<UserEntity> getUserEntity(Long Id);

}
