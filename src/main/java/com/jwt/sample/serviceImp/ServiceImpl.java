package com.jwt.sample.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.jwt.sample.Entity.Users;

@Service
public class ServiceImpl {
	
	private List<Users> data=new ArrayList<>();
	
	public ServiceImpl() {
		data.add(new Users(UUID.randomUUID().toString(),"Papnna Lakpatre","papnna@gmail.com",24));
		data.add(new Users(UUID.randomUUID().toString(),"rajaram Lakpatre","rajaram@gmail.com",53));
		data.add(new Users(UUID.randomUUID().toString(),"nagmani Lakpatre","nagmani@gmail.com",50));
		data.add(new Users(UUID.randomUUID().toString(),"hariom bhogewar","hariom@gmail.com",15));
		
		
	}
	
	public List<Users> getAllUsers(){
		return this.data;
	}

	public List<Users> getUsersaboveage(int age) {
		// TODO Auto-generated method stub
		return 	data.stream().filter(u->u.getAge()>age).collect(Collectors.toList());
		
	}
	
	public List<Users> setaUser(Users users) {
		data.add(new Users(users.getUserId(),users.getName(),users.getEmail(),users.getAge()));
		return data.stream().filter(u->u.getUserId().equals(users.getUserId())).collect(Collectors.toList());
	}

}
