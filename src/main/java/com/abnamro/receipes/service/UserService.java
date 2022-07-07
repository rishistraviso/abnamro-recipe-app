package com.abnamro.receipes.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.abnamro.receipes.entity.User;
import com.abnamro.receipes.exception.ApiServerException;
import com.abnamro.receipes.exception.DataNotFoundException;

public interface UserService {
	ResponseEntity<List<User>> getAllUser() throws ApiServerException, DataNotFoundException;
	ResponseEntity<User> createUser(@RequestBody User user);
	ResponseEntity<User> updateUser(@PathVariable("id") long id, @RequestBody User user);
	ResponseEntity<User> updateUserData(long id, User user);
}
