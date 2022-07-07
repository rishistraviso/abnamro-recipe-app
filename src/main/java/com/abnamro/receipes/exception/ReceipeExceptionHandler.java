package com.abnamro.receipes.exception;

import static com.abnamro.receipes.constants.Constants.*;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author : Rishikesh Kashid
 * This class is handles centralized exception handling
 */

@RestControllerAdvice
public class ReceipeExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * This method is return proper error and details about DataNotFoundException
	 * @return ResponseEntity error response with body and status
	 */
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<Object> handleCityNotFoundException() {
		Map<String, Object> body = getBody(NOT_FOUND_IN_SYSTEM, HttpStatus.NOT_FOUND.value(), NOT_FOUND_DETAILS);
		return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
	}

	/**
	 * This method is return proper error and details about ApiServerException
	 * @return ResponseEntity error response with body and status
	 */
	@ExceptionHandler(ApiServerException.class)
	public ResponseEntity<Object> handleApiServerException() {
		Map<String, Object> body = getBody(INTERNAL_SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value(), SERVER_ERROR_DETAILS);
		return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	/**
	 * This method is return proper error and details about ApiBadRequestException
	 * @return ResponseEntity error response with body and status
	 */
	@ExceptionHandler(ApiBadRequestException.class)
	public ResponseEntity<Object> handleApiBadRequestException() {
		Map<String, Object> body = getBody(BAD_REQUEST, HttpStatus.BAD_REQUEST.value(), BAD_REQUEST_DETAILS);
		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}

	private Map<String, Object> getBody(String msg, int code, String details) {
		Map<String, Object> body = new LinkedHashMap<>();
		body.put(MSG, msg);
		body.put(CODE, code);
		body.put(DETAILS, details);
		return body;
	}

}
