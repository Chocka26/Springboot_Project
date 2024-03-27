package com.demo2.UserService;

import java.util.List;
import java.util.Optional;

import com.demo2.entity.User;

public interface UserService {
	
	User CreateUser(User u);

	List<User> findAll();

	User getUserByName(String name);


	Optional<User> findById(int id);

	User save(User u);
		

	
	
	

}
