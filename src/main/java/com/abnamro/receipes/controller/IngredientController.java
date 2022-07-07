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

import com.abnamro.receipes.entity.Ingredients;
import com.abnamro.receipes.exception.ApiServerException;
import com.abnamro.receipes.exception.DataNotFoundException;
import com.abnamro.receipes.service.IngredientsService;

/**
 * @author : Rishikesh Kashid
 * This is controller class which have three endpoints for save , update , getall ingredients
 */
@RestController
@RequestMapping("/api/ingredients")
public class IngredientController {
	
	private static final Logger logger = LoggerFactory.getLogger(IngredientController.class);

	@Autowired
	private IngredientsService ingredientsService;

	@GetMapping(value = "/all")
	public ResponseEntity<List<Ingredients>> getIngredients() throws ApiServerException, DataNotFoundException {
		return ingredientsService.getIngredients();
	}
	@PostMapping("/save")
	public ResponseEntity<Ingredients> createIngredient(@RequestBody Ingredients ingredients) {
		return ingredientsService.createIngredients(ingredients);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Ingredients> updateIngredient(@PathVariable("id") long id, @RequestBody Ingredients ingredients) {
		return ingredientsService.updateIngredients(id, ingredients);
	}

}
