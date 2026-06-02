package org.jsp.LibraryManagement.dto;

public class LoginResponse {

    private boolean success;
    private String loginBy;
    private String message;
    private int id;

    public LoginResponse(boolean success, String loginBy, String message,int id) {
        this.success = success;
        this.loginBy = loginBy;
        this.message = message;
        this.id=id;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getLoginBy() {
        return loginBy;
    }

    public String getMessage() {
        return message;
    }
    
    public int getId() {
    	return id;
    }
}
