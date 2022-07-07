package com.abnamro.receipes.dto;

import java.util.List;

import com.abnamro.receipes.entity.Ingredients;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ReceipeDetails {

	private String name;

	private int noOfServers;

	private String instructions;

	private int receipeType;

	private List<Ingredients> ingredientsList;

	private String ingredients;

	public ReceipeDetails() {

	}
	public ReceipeDetails(String name, int noOfServers, String instructions, int receipeType) {
		super();
		this.name = name;
		this.noOfServers = noOfServers;
		this.instructions = instructions;
		this.receipeType = receipeType;
	}
	public ReceipeDetails(String name,  String instructions,String ingredients,int noOfServers, int receipeType) {
		super();
		this.name = name;
		this.noOfServers = noOfServers;
		this.instructions = instructions;
		this.receipeType = receipeType;
		this.ingredients = ingredients;
	}
}
