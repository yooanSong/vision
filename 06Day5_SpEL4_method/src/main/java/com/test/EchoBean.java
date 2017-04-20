package com.test;

import org.springframework.beans.factory.annotation.Autowired;

public class EchoBean {

	private AnotherBean anotherBean;

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

}
