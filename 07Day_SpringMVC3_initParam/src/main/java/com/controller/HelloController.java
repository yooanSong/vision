package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HelloController {
	
	@RequestMapping("/aaa") //http://localhost:8090/app/xxx
	public String xxxx(){ 
		System.out.println("aaaa");
		return "hello"; 
	}
	
	@RequestMapping("/bbb") //http://localhost:8090/app/yyy
	public String yyy(){
		System.out.println("bbbb");
		return "hello"; 
	}

}
