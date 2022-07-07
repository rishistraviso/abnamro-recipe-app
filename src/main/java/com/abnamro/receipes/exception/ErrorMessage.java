package com.abnamro.receipes.exception;

import lombok.Data;

/**
 * @author : Rishikesh Kashid
 * This class binds the error details
 */
@Data
public class ErrorMessage {
    private String msg;
    private int code;

    public ErrorMessage(String error, int code) {
        this.msg = error;
        this.code = code;
    }
}
