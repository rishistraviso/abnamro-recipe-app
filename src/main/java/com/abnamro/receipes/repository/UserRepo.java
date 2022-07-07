package com.abnamro.receipes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abnamro.receipes.entity.User;

public interface UserRepo  extends JpaRepository<User, Long> {
	User findByEmail(String userId);
}
