package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping
	public String ttt() {
		System.out.println("ttt");
		return "hello";
	}
	
	@RequestMapping("/aaa")
	public String xxxx() {
		System.out.println("aaa");
		return "hello";
	}


	@RequestMapping("/bbb/*")
	public String bbb() {
		System.out.println("bbb");
		return "hello";
	}


	@RequestMapping("/ccc*")
	public String ccc() {
		System.out.println("ccc");
		return "hello";
	}


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

	//restful 아닌 형식 
	//http://localhost:8090/app/searchServlet?userid=kkk&age=20 의도가 있음
	//Restful 형식
	//http://localhost:8090/app/userid/kkk/age/20 + 동작정보(method) 
	//method 종류: postget putdelete 
	
	@RequestMapping("/userid/{xxx}/age{xxx2}")
	public String xxx(@PathVariable String xxx, @PathVariable String xxx2) {
		System.out.println(xxx+"\t"+xxx2);
		return "hello";
	}

}
