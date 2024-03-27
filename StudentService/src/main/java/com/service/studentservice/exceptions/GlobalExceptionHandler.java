package com.service.studentservice.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.service.studentservice.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFound exNotFound){
       String msg= exNotFound.getMessage();
       ApiResponse response= ApiResponse.builder().message(msg).status(HttpStatus.NOT_FOUND).success(true).build();
       return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
    }
}
