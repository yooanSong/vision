package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.MyService;

@Controller 
public class HelloController {
	
	@Autowired
	private MyService service; //injection 받는방법 
	
	@RequestMapping("/aaa") //http://localhost:8090/app/xxx
	public String xxxx(){ 
		service.mesg();
		return "hello"; 
	}
	
	

}
