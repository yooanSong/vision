package com.test;

import org.springframework.beans.factory.annotation.Autowired;

public class EchoBean {

	@Autowired
	private AnotherBean anotherBean;

public AnotherBean getAnotherBean() {
	return anotherBean;
}

  
  
}
