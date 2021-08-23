package org.mindtree.customer.controller.advicecontroller;

import org.mindtree.customer.exception.Handler;
import org.mindtree.customer.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionAdvice {
	
	@ExceptionHandler(value = ResourceNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public Handler handleResourceNotFound(ResourceNotFoundException exception) {
		return new Handler(exception.getMessage());
	}

}
