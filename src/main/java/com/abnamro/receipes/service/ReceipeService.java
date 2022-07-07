package com.abnamro.receipes.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.abnamro.receipes.dto.ReceipeDetails;
import com.abnamro.receipes.dto.ReceipeSearchCritria;
import com.abnamro.receipes.entity.Receipe;
import com.abnamro.receipes.exception.ApiServerException;
import com.abnamro.receipes.exception.DataNotFoundException;

public interface ReceipeService {
	ResponseEntity<List<Receipe>> getAllReceipe() throws ApiServerException, DataNotFoundException;
	ResponseEntity<Receipe> createReceipe(@Valid @RequestBody Receipe receipe);
	ResponseEntity<Receipe> updateReceipe(@PathVariable("id") long id, @RequestBody Receipe receipe);
	ResponseEntity<List<Receipe>> getAllReceipe(@PathVariable("typeId") int typeId) throws ApiServerException, DataNotFoundException;
	ResponseEntity<List<Receipe>> getAllReceipe(@PathVariable("typeId") int typeId,@PathVariable("noOfServers") int noOfServers) throws ApiServerException, DataNotFoundException;
	ResponseEntity<List<ReceipeDetails>> getAllReceipeDetails() throws ApiServerException, DataNotFoundException;
	Page<Receipe> getReceipe(@Valid ReceipeSearchCritria searchCriteria) throws ApiServerException, DataNotFoundException;
}
