package com.hackathon.produkten.ing.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.hackathon.produkten.ing.exception.ExceptionResponse;



@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	  public final ResponseEntity<ExceptionResponse> handleUserNotFoundException
	  (Exception ex, WebRequest request) {
		  
		ExceptionResponse errorDetails = new com.hackathon.produkten.ing.exception.ExceptionResponse(new Date(), request.getDescription(false),ex.getMessage());
	    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	    
	  }
}
