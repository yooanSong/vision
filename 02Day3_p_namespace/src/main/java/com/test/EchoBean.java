package com.test;

public class EchoBean {

	private String mesg; //property
	private int age;
	
	
	public String getMesg() {
		return mesg;
	}


	public void setMesg(String mesg) {
		this.mesg = mesg;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String sayEcho(){
		return "안녕하세요";
	}
	public EchoBean(int age) {
		
		this.age = age;
	}
	
	public EchoBean() {
		System.out.println("EchoBean 생성자");
	}
	
	
}
