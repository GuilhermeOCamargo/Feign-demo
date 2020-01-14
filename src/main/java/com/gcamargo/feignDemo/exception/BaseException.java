package com.gcamargo.feignDemo.exception;

import org.springframework.http.HttpStatus;

import java.util.Calendar;

public class BaseException extends RuntimeException {
    private long timestamp;
    private HttpStatus statusCode;
    public BaseException(String message, HttpStatus statusCode) {
        super(message);
        this.timestamp = Calendar.getInstance().getTimeInMillis();
        this.statusCode = statusCode;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }
}