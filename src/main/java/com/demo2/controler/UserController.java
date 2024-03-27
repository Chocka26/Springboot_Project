package com.demo2.controler;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo2.UserService.UserService;
import com.demo2.entity.User;
import com.demo2.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/user")
public class UserController 
{
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	UserService userService;
	
//	@PostMapping("/add")
//	public User addUser(@RequestBody User user) {
//		//TODO: process POST request
//		User u = userRepo.save(user);
//		return u;
//	}
	
	@PostMapping("/add")
	public User adduser(@RequestBody User user)
	{
		User u = userService.CreateUser(user);
		return u;
	}
	
	
	
//	@GetMapping("/getAll")
//	public List<User> getAllUser() 
//	{
//		
//		  
//		return userRepo.findAll();
//	}
	
	@GetMapping("/getAll")
	public List<User> getAllUser(){
		
		return userService.findAll();
	}
	
	
//	@GetMapping("/getUser/{name}")
//	
//	public User getUserByName(@PathVariable String name)
//	{
//		
//		return userRepo.getUserByName(name);
//		
//	}
	
	
	@GetMapping("/getUser1/{name}")
	public User getUserByName(@PathVariable String name)
	{
		return userService.getUserByName(name);
	}
	
	
//	@GetMapping("/getUser/{id}")
//	
//	public User getUserById(@PathVariable int id)
//	{
//		
//		return userRepo.findById(id).get();
//		
//	}
	
	@GetMapping("/getUser2/{id}")
	public User getUserById1(@PathVariable int id)
	{
		return userService.findById(id).get();
	}
	
	
//	@PostMapping("/update/{id}")
//	
//	public User updateUser(@RequestBody User user , @PathVariable int id)
//	{
//		
//		User u = userRepo.findById(id).get();
//		u.setEmail(user.getEmail());
//		u.setAge(user.getAge());
//		return userRepo.save(u);
//		
//		
//	}
	
	@PostMapping("/update/{id}")
	public User updateUser(@RequestBody User user , @PathVariable int id) {
		
		User u = userService.findById(id).get();
		u.setEmail(user.getEmail());
		u.setAge(user.getAge());
		return userService.save(u);
		
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id)
	{
		userRepo.deleteById(id);
		return "Deleted Successfullyy";
	}
	
	@GetMapping("/delete1/{id}")
	public ResponseEntity<?>delete(@PathVariable int id)
	{
		userRepo.deleteById(id);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body("delete successfully");
	}
	

}