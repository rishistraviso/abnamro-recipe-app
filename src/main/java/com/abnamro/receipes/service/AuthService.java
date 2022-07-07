package com.abnamro.receipes.service;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.abnamro.receipes.request.LoginRequest;
import com.abnamro.receipes.request.SignupRequest;

public interface AuthService {
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest);
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest);
	public ResponseEntity<?> logoutUser();
}
