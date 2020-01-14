package com.gcamargo.feignDemo.exception;

import org.springframework.http.HttpStatus;

public class InternalErrorException extends BaseException {
    public InternalErrorException(String message) {
        super(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}