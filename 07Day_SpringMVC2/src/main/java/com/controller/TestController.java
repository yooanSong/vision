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
		//�������ִ� String�� view�̸��̴�
		//view resolver�� ��Ͼ��������� ��ġ �� �˷�����ϰ�
		//servlet-context.xml �� ��� �ϸ� view�̸��� ���� �ȴ�  
	}
	
	@RequestMapping("/yyy") //http://localhost:8090/app/yyy
	public String yyy(){
		System.out.println("yyyy");
		return "hello"; 
	}

}