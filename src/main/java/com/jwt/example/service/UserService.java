package com.jwt.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.model.User;

@Service
public class UserService {
	
	private List<User> users = new ArrayList<>();

	
	
	public UserService() {
		users.add(new User(UUID.randomUUID().toString(), "naman", "naman@dev.com"));
		users.add(new User(UUID.randomUUID().toString(), "navin", "navin@dev.com"));
		users.add(new User(UUID.randomUUID().toString(), "panne", "panne@dev.com"));
		users.add(new User(UUID.randomUUID().toString(), "suraj", "suraj@dev.com"));
	}
	
	public List<User> getAllUsers() {
		return this.users;
	}
}
