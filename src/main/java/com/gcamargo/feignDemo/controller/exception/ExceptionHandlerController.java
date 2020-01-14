package com.gcamargo.feignDemo.controller.exception;

import com.gcamargo.feignDemo.exception.BaseException;
import com.gcamargo.feignDemo.model.dto.StandardErrorDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<StandardErrorDto> handleException(BaseException e){
        return ResponseEntity.status(e.getStatusCode()).body(new StandardErrorDto(e));
    }

}