package com.test;

public class EchoBean {

	public String sayEcho(){
		return "안녕하세요";
	}

	public EchoBean(String n) {
		System.out.println("EchoBean 생성자");
	}
	
	
}
