package com.jwt.sample.Entity;


import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users {

	private String userId;
	private String name;
	private String email;
	private int age;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	
	public Users(String userId, String name, String email, int age) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.age=age;
	}

	public Users() {
		super();
	}
	
	
	
	
	

}
