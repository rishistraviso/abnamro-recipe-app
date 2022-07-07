package com.abnamro.receipes.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.abnamro.receipes.entity.Ingredients;
import com.abnamro.receipes.exception.ApiServerException;
import com.abnamro.receipes.exception.DataNotFoundException;

public interface IngredientsService {
	ResponseEntity<List<Ingredients>> getIngredients() throws ApiServerException, DataNotFoundException;
	ResponseEntity<Ingredients> createIngredients(@Valid @RequestBody Ingredients ingredients);
	ResponseEntity<Ingredients> updateIngredients(@PathVariable("id") long id,@Valid @RequestBody Ingredients ingredients);
}
