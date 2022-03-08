package com.abc.teamservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
	public class GlobalExceptionHandler extends ResponseEntityExceptionHandler
	{
		@ExceptionHandler(TeamNotFoundException.class)
		public ResponseEntity<String> handleCustomerNotExistingException(Exception e)
		{
			ResponseEntity<String> responseEntity= new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
			return responseEntity;
		}

}
