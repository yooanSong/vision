package com.test;

import org.springframework.beans.factory.annotation.Value;

public class AnotherBean {
	
	@Value("#{ppp.name}")
	private String username;
	
	@Value("#{ppp.age}")
	private int age;

	public AnotherBean(String x, int age) {
		super();
		this.username = x;
		this.age = age;
	}
	public AnotherBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "AnotherBean [username=" + username + ", age=" + age + "]";
	}
	
	
}
