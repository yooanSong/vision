package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EchoBean {
	
	@Autowired
	private List<AnotherBean> xxx; 

	public List<AnotherBean> getXxx() {
		return xxx;
	}

	public void setXxx(List<AnotherBean> xxx) {
		this.xxx = xxx;
	}
	
	
  
  
}
