package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.MyService;

@Controller 
public class TestController {
	
	@Autowired
	private MyService service; //injection �޴¹�� 
	
	@RequestMapping("/xxx") //http://localhost:8090/app/xxx
	public String xxxx(){ 
		
		service.mesg();
		return "hello"; 
		
	}
	
	
}
