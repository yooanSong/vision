package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	// http://localhost:8090/app/aaa
	// http://localhost:8090/app/aaa.�ƹ��ų�
	// http://localhost:8090/app/aaa/
	@RequestMapping("/aaa")
	public String xxxx() {
		System.out.println("aaa");
		return "hello";
	}

	// http://localhost:8090/app/bbb/
	// http://localhost:8090/app/bbb/�ƹ��ų�
	// http://localhost:8090/app/bbb/*
	@RequestMapping("/bbb/*")
	public String bbb() {
		System.out.println("bbb");
		return "hello";
	}

	// http://localhost:8090/app/ccc
	@RequestMapping("/ccc*")
	public String ccc() {
		System.out.println("ccc");
		return "hello";
	}

	// **: ���丮
	@RequestMapping("/ddd/**/fff")
	public String ddd() {
		System.out.println("ddd");
		return "hello";
	}
	
	@RequestMapping({"/eee", "/eee2"})
	public String eee() {
		System.out.println("eee");
		return "hello";
	}

	//restful �ƴ� ���� 
	//http://localhost:8090/app/searchServlet?userid=kkk&age=20 �ǵ��� ����
	//Restful ����
	//http://localhost:8090/app/userid/kkk/age/20 + ��������(method) 
	//method ����: postget putdelete 
	
	@RequestMapping("/userid/{xxx}/age{xxx2}")
	public String xxx(@PathVariable String xxx, @PathVariable String xxx2) {
		System.out.println(xxx+"\t"+xxx2);
		return "hello";
	}

}