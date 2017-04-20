package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean bean = ctx.getBean("echo", EchoBean.class);
		AnotherBean another= bean.getAnotherBean();
		System.out.println(another.getUsername()+"\t"+another.getAge());

	}

}
