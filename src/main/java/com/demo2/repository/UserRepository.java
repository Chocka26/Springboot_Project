package com.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo2.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.userName=?1") // JPA QUERY
	
	User getUserByName(String userName);
	

}