package org.jsp.LibraryManagement.service;

import java.util.Optional;

import org.jsp.LibraryManagement.dao.UserDao;
import org.jsp.LibraryManagement.dto.LoginResponse;
import org.jsp.LibraryManagement.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public Users saveUser(Users user){
		Optional<Users> opt=dao.findUserByEmail(user.getEmail());
		if(opt.isPresent())
			throw new RuntimeException("User Already Exists");
		return dao.saveUser(user);
	}

	public LoginResponse getUserDetails(String email, String password) {
		Optional<Users> opt=dao.findUserByEmail(email);
		if(opt.isPresent()) {
			if(password.equals(opt.get().getPassword())) {
				return new LoginResponse(true,opt.get().getLoginBy(),"Login successful",opt.get().getId());
			}
		}
		 return new LoginResponse(false,null,"Invalid email or password",0);
	}

	public Optional<Users> findUserById(int id) {
		return dao.findUserById(id);
	}
	
}
