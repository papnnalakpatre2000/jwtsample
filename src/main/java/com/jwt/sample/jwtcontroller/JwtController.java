package com.jwt.sample.jwtcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.sample.Entity.Users;
import com.jwt.sample.serviceImp.ServiceImpl;

@RequestMapping("/admin")
@RestController
public class JwtController {
	
	@Autowired
	private ServiceImpl serviceImpl;
	
	
	
//	http://localhost:8080/admin/users
//	To get the all the users
	
	@GetMapping("/users")
	public ResponseEntity<List<Users>> getUsers(){
		
		try {
			List<Users> users=serviceImpl.getAllUsers();
			return ResponseEntity.of(Optional.of(users));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ResponseEntity.badRequest().build();
	}
	
//	http://localhost:8080/admin/usersbyage
//	add the age in the url path to get the users above the entered age

	
	@GetMapping("/usersbyage/{age}")
	public ResponseEntity<List<Users>> getUsersaboveage(@PathVariable int age ){
		
		try {
			List<Users> users=serviceImpl.getUsersaboveage(age);
			return ResponseEntity.of(Optional.of(users));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ResponseEntity.badRequest().build();
	}
	
//	http://localhost:8080/admin/usersbyages
//	and add the paramerters (age)in the param in postman to get the users above the entered age
	
	@GetMapping("/usersbyages")
	public ResponseEntity<List<Users>> getUsersaboveages(@RequestParam int age ){
		
		try {
			List<Users> users=serviceImpl.getUsersaboveage(age);
			return ResponseEntity.of(Optional.of(users));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ResponseEntity.badRequest().build();
	}
	
//	write add/post method  http://localhost:8080/admin/adduser
	
}
