package com.abnamro.receipes.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abnamro.receipes.dto.ReceipeSearchCritria;
import com.abnamro.receipes.entity.Receipe;
import com.abnamro.receipes.exception.ApiServerException;
import com.abnamro.receipes.exception.DataNotFoundException;
import com.abnamro.receipes.service.ReceipeService;
/**
 * @author : Rishikesh Kashid
 * This is controller class which have one entry point Searching recipes 
 */
@RestController
@RequestMapping("/api/search")
public class SearchController {

	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);

	@Autowired
	private ReceipeService receipeService;
	
	 /**
     * This method fetch all recipe from database and send to client
     * @return List<Receipe>
     * @throws ApiServerException
     * @throws DataNotFoundException
     */
	@GetMapping(value = "/recipe")
	public ResponseEntity<Page<Receipe>> searchRecipe(@RequestBody
			ReceipeSearchCritria employeeSearchCriteria) throws ApiServerException, DataNotFoundException{
		logger.info("##### SearchController :: searchReceipes ###");
		return new ResponseEntity<>(receipeService.getReceipe(employeeSearchCriteria),
				HttpStatus.OK);
	}

}
