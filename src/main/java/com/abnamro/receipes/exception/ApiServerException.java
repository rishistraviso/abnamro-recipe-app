package com.abnamro.receipes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author :Rishikesh Kashid
 * This class handles the server errors
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ApiServerException extends Throwable {
    public ApiServerException() {
        super();
    }
}
