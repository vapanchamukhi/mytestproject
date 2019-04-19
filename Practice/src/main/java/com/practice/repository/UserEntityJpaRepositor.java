package com.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entity.UserEntity;

public interface UserEntityJpaRepositor extends JpaRepository<UserEntity, Long>{
	public List<UserEntity> findByUserName(String userName);
}
