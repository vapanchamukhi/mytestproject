package com.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.UserEntity;
import com.practice.repository.UserEntityJpaRepositor;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserEntityJpaRepositor userEntityJpaRepository;

	public UserEntity saveUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		userEntityJpaRepository.save(userEntity);
		return userEntity;
	}
	
	public List<UserEntity> getAll(){
		return userEntityJpaRepository.findAll();
	}
	
	public Optional<UserEntity> getUserEntity(Long Id) {
		return userEntityJpaRepository.findById(Id);
	}

}
