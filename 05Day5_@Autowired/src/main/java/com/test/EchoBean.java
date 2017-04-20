package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class EchoBean {
	
	@Autowired(required=false) 
	//변수, 생성자, 메서드 모두 다 사용가능하다 일반적으로 변수에 쓴다
	//그 이유는 변수에 쓰면 생성자, 메서드가 필요없기 때문에 
	//(required=false)를 주면 필수 속성 해제 가능 
	private AnotherBean anotherBean;
	
	
	public EchoBean(AnotherBean anotherBean) {
		super();
		this.anotherBean = anotherBean;
	}

	public EchoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnotherBean getAnotherBean() {
		return anotherBean;
	}

	 // 에코빈에 자동으로 anotherBean이 injection 된것 
	public void setAnotherBean(AnotherBean anotherBean) {
		this.anotherBean = anotherBean;
	}

}
