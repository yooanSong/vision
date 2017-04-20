package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EchoBean {
	
	@Autowired
	@Qualifier(value="y")   //변수에다 주는게 일반적이다 간결하고 가독성이 높기때문 
	private AnotherBean another;
	
	
	public EchoBean(AnotherBean another2) {
		super();
		this.another = another2;
	}

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnotherBean getAnotherBean() {
		return another;
	}


	//@Autowired
	//@Qualifier(value="y")
	//@Qualifier("x") //id가 x인 property가 Qualify된다 
	/*public void setAnotherBean(@Qualifier(value="y") AnotherBean another3) {
		this.another = another3;
	}*/
	public void setAnotherBean(AnotherBean another3) {
		this.another = another3;
	}

}
