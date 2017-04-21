package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class TestController {
	
	@RequestMapping("/xxx") //http://localhost:8090/app/xxx
	public String xxxx(){ 
		System.out.println("xxxx");
		return "hello"; 
		//return "/WEB-INF/view/hello";
		//리턴해주는 String은 view이름이다
		//view resolver를 등록안했을때는 위치 다 알려줘야하고
		//servlet-context.xml 에 등록 하면 view이름만 쓰면 된다  
	}
	
	@RequestMapping("/yyy") //http://localhost:8090/app/yyy
	public String yyy(){
		System.out.println("yyyy");
		return "hello"; 
	}

}
