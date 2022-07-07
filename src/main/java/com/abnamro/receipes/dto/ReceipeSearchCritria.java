package com.abnamro.receipes.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ReceipeSearchCritria {
	
	private int noOfServers;
	private String instructions;
	private int receipeType;
	private int isIngredientsIncluded;
	private String ingredients;
	
}
