package org.jsp.LibraryManagement.exceptions;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AllExceptions {

	@ExceptionHandler(BookAlreadyExists.class)
	public ResponseEntity<Map<String, Object>> exception1(BookAlreadyExists e) {
		Map<String, Object> error=new HashMap<String, Object>();
		
		error.put("error",e.getMessage());
		error.put("status", HttpStatus.BAD_REQUEST);
		error.put("time", LocalTime.now());
		
		return new ResponseEntity<Map<String,Object>>(error,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(NoBookFound.class)
	public ResponseEntity<Map<String, Object>> exception1(NoBookFound e) {
		Map<String, Object> error=new HashMap<String, Object>();
		
		error.put("error",e.getMessage());
		error.put("status", HttpStatus.BAD_REQUEST);
		error.put("time", LocalTime.now());
		
		return new ResponseEntity<Map<String,Object>>(error,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(UserAlreadyExists.class)
	public ResponseEntity<Map<String, Object>> exception1(UserAlreadyExists e) {
		Map<String, Object> error=new HashMap<String, Object>();
		
		error.put("error",e.getMessage());
		error.put("status", HttpStatus.BAD_REQUEST);
		error.put("time", LocalTime.now());
		
		return new ResponseEntity<Map<String,Object>>(error,HttpStatus.BAD_REQUEST);
	}
}
