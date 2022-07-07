package com.abnamro.receipes.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abnamro.receipes.request.LoginRequest;
import com.abnamro.receipes.request.SignupRequest;
import com.abnamro.receipes.service.impl.AuthServiceImpl;


/**
 * @author : Rishikesh Kashid
 * This is controller is used to authentication of user by using singing , new user creation and logout
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@Autowired
	AuthServiceImpl authServiceImpl;
	
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
		return authServiceImpl.authenticateUser(loginRequest);
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
		return authServiceImpl.registerUser(signUpRequest);
	}

	@PostMapping("/signout")
	public ResponseEntity<?> logoutUser() {
		return authServiceImpl.logoutUser();
	}
}
