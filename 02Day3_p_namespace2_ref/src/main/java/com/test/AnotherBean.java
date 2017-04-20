package com.test;

public class AnotherBean {
	//dao service controller 의존관계가 있다 -> injection해줘야 한다 
	
	private String username;
	private int age;
	
	public String getUsername() {
		return username;
	}
	public AnotherBean() {
		super();
		// TODO Auto-generated constructor stub
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
	public AnotherBean(String username, int age) {
		super();
		this.username = username;
		this.age = age;
	}
	
	//이것에 해당하는 값을 설정하는 방법이 setter 메소드 만드는것, 생성자도 인자있는에 없는애 만드는것
	//spring에서 객체생성하는 방법이 xml만드는것 
	

}
