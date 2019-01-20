package com.LoggitorApp.LoggitorApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LoggitorApp.LoggitorApp.domain.User;


@RestController
public class UserController {
	@Autowired 
    private com.LoggitorApp.LoggitorApp.domain.UserRepository UserRepository;

//	@RequestMapping("/users")
//	public Iterable<User> getUsers() {
//        return UserRepository.findAll();
//	} 
}
