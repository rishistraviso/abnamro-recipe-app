package com.abnamro.receipes.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

/**
 * @author : Rishikesh Kashid
 * DTO class do mapping with backend entity data and provide well-structured data to client
 */

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class IngredientsDetails {
	
}
