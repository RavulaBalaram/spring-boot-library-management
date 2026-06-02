package org.jsp.LibraryManagement.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fullName;
	private String email;
	private String password;
	private long mobileNumber;
	private LocalDateTime createdAt;
	
	private String loginBy;
	
	@PrePersist
    public void beforeSave() {
        this.createdAt = LocalDateTime.now();

        if (this.loginBy == null) {
            this.loginBy = "user";
        }
    }
	
	
	
	public String getLoginBy() {
		return loginBy;
	}



	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
}
