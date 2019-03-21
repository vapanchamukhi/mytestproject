package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entity.UserEntity;

public interface UserEntityJpaRepositor extends JpaRepository<UserEntity, Long>{

}
