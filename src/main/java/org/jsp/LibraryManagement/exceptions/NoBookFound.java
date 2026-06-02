package org.jsp.LibraryManagement.exceptions;

public class NoBookFound extends RuntimeException{

	public NoBookFound(String msg) {
		super(msg);
	}
}
