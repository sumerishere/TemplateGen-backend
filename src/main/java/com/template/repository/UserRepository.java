package com.template.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.template.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUserName(String userName);
}