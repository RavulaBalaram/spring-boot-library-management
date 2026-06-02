package org.jsp.LibraryManagement.controller;

import java.util.Optional;

import org.jsp.LibraryManagement.dto.LoginRequest;
import org.jsp.LibraryManagement.dto.LoginResponse;
import org.jsp.LibraryManagement.entity.Users;
import org.jsp.LibraryManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public Users saveUser(@RequestBody Users user) {
        return userService.saveUser(user);
    }
    
    @GetMapping("{id}")
    public Optional<Users> getUserDetails(@PathVariable int id) {
    	return userService.findUserById(id);
    }
    
    @PostMapping("/login")    
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {

        LoginResponse response = userService.getUserDetails(request.getEmail(),request.getPassword());
        if (response.isSuccess()) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(401).body(response);
        }
    }
}


