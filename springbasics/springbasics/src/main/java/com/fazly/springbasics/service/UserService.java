package com.fazly.springbasics.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fazly.springbasics.model.User;
import com.fazly.springbasics.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
public String sayHello() {
	return "Hello";
}
public String saveUser(User user) {
	Optional<User> isUser=userRepository.findByEmail(user.getEmail());
	if(!isUser.isPresent()) {
		userRepository.save(user);
		return "User saved Successfully";
	}
	else{
		return "User already exists by email: "+user.getEmail();
	}
}
public List<User> getAllUsers(){
	return userRepository.findAll();
}
}