package com.test;

public class EchoBean {
	
	private String mesg; 
	private String age;
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMesg() {
		return mesg;
	}

	public void setMesg(String x) {
		this.mesg = mesg;
	}

	public String sayEcho() {
		return "안녕하세요 ";
	}

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("echobean 생성자");
		
	}
}
