package org.jsp.LibraryManagement.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(NoBookFound.class)
    public String handleNoBookFound(NoBookFound ex) {
        return ex.getMessage();
    }
	
	@ExceptionHandler(BookAlreadyExists.class)
    public String handleNoBookFound(BookAlreadyExists ex) {
        return ex.getMessage();
    }
	@ExceptionHandler(UserAlreadyExists.class)
	public String handleNoBookFound(UserAlreadyExists ex) {
		return ex.getMessage();
	}
	
    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex) {
        return ex.getMessage();
    }
}