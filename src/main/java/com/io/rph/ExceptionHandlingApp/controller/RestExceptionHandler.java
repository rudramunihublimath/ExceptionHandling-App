package com.io.rph.ExceptionHandlingApp.controller;

import com.io.rph.ExceptionHandlingApp.entity.ApiError;
import com.io.rph.ExceptionHandlingApp.exception.NoProductFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = NoProductFoundException.class)
    public ResponseEntity<ApiError> handleNooProductExc(){
        ApiError error= new ApiError(400,"No Product found",new Date());
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
}
