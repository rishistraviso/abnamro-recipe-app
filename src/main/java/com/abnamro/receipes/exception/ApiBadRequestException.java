package com.abnamro.receipes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author : Rishikesh Kashid
 * This class handles bad request errors
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ApiBadRequestException extends Throwable {
    public ApiBadRequestException() {
        super();
    }
}
