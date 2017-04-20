package com.test;

import org.springframework.beans.factory.annotation.Required;

public class EchoBean {
   private AnotherBean anotherBean;

public AnotherBean getAnotherBean() {
	return anotherBean;
}

@Required //에코빈에 anotherBean을 꼭 injection해줘야한다 
public void setAnotherBean(AnotherBean anotherBean) {
	this.anotherBean = anotherBean;
}
  
  
  
}