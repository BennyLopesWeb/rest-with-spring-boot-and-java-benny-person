package br.com.benny.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RequiredObjectIsNullException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public RequiredObjectIsNullException() {
		super("It is not allowed to perist a null object!");
	}
	
	public RequiredObjectIsNullException(String ex) {
		super(ex);
	}
	



}
