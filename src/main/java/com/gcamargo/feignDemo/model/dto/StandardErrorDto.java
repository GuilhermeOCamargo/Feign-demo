package com.gcamargo.feignDemo.model.dto;

import com.gcamargo.feignDemo.exception.BaseException;

import java.io.Serializable;

public class StandardErrorDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String message;
    private Long timestamp;

    @Deprecated
    public StandardErrorDto() {
    }

    public StandardErrorDto(BaseException e) {
        message = e.getMessage();
        timestamp = e.getTimestamp();
    }

    public String getMessage() {
        return message;
    }

    public Long getTimestamp() {
        return timestamp;
    }
}