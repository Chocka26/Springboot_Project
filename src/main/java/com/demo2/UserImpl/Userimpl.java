package com.demo2.UserImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo2.UserService.UserService;
import com.demo2.entity.User;
import com.demo2.repository.UserRepository;

@Service
public class Userimpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	
	public User CreateUser(User u) {
		
		return userRepo.save(u);
	}

	public List<User> findAll() {
		
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return userRepo.getUserByName(name);
	}

	public Optional<User> findById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}

	public User save(User u) {
		// TODO Auto-generated method stub
		return userRepo.save(u);
	}
	

}
