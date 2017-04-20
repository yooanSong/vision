package com.test;

import javax.inject.Inject;
import javax.inject.Named;

public class EchoBean {

	@Inject
	@Named(value = "another2")
	private AnotherBean anotherBean;

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

}
