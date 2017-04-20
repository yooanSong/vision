package com.test;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class EchoBean implements MessageSourceAware {
	
	//EchoBean에서 messageSource를 썼다 
	MessageSource messageSource;
	
	
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public String sayEcho(){
		
		String mesg= messageSource.getMessage("hello", null, Locale.KOREA);
		System.out.println(mesg);
		
		return "안녕";
	}

	public EchoBean() {
		System.out.println("EchoBean 생성자");
	}
	
	
}
