package com.test;


import javax.annotation.Resource;

public class EchoBean {

	@Resource //(name="another2")
	private AnotherBean anotherBean;

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

}
