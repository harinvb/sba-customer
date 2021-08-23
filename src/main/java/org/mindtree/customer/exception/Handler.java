package org.mindtree.customer.exception;

import java.time.LocalDate;

public class Handler {
	
	LocalDate date;
	String message;
	
	
	public Handler(String message) {
		super();
		this.date = LocalDate.now();
		this.message = message;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
