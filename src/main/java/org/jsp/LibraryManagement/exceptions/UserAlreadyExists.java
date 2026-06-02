package org.jsp.LibraryManagement.exceptions;

public class UserAlreadyExists extends RuntimeException{

	public UserAlreadyExists(String msg) {
		super(msg);
	}
}
