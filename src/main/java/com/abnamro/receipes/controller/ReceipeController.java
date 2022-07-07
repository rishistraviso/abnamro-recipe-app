package com.abnamro.receipes.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abnamro.receipes.entity.Receipe;
import com.abnamro.receipes.exception.ApiServerException;
import com.abnamro.receipes.exception.DataNotFoundException;
import com.abnamro.receipes.service.ReceipeService;


/**
 * @author : Rishikesh Kashid
 * This is controller class which have three endpoints for save , update , get All Recipe
 */
@RestController
@RequestMapping("/api/receipe")
public class ReceipeController {

	private static final Logger logger = LoggerFactory.getLogger(ReceipeController.class);

	@Autowired
	private ReceipeService receipeService;
	
	@PostMapping("/save")
	public ResponseEntity<Receipe> createReceipe(@RequestBody Receipe receipe) {
		return receipeService.createReceipe(receipe);
	}
	@GetMapping(value = "/all")
	public ResponseEntity<List<Receipe>> getAllReceipe() throws ApiServerException, DataNotFoundException {
		return  receipeService.getAllReceipe();
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<Receipe> updateIngredient(@PathVariable("id") long id, @RequestBody Receipe receipe) {
		return receipeService.updateReceipe(id, receipe);
	}

}
