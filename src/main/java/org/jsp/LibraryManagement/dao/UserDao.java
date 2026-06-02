package org.jsp.LibraryManagement.dao;

import java.util.Optional;

import org.jsp.LibraryManagement.entity.Users;
import org.jsp.LibraryManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	private UserRepository repository;
	
	public Users saveUser(Users user){
		return repository.save(user);
	}
	
	public Optional<Users> findUserById(int id){
		return repository.findById(id);
	}
	
	public Optional<Users> findUserByEmail(String email){
		Optional<Users> opt=repository.findByEmail(email);
		return opt;
	}
}
