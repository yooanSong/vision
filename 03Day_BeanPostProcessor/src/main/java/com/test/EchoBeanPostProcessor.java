package com.test;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class EchoBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String str) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization"+obj+"\t"+str);
		return new Date();
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String str) throws BeansException {
		// TODO Auto-generated method stub
		return obj;
	}

}
