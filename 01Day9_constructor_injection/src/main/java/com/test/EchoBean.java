package com.test;

public class EchoBean {
    private String mesg;
	public String sayEcho(){
		return "안녕하세요" + mesg;
	}

	public EchoBean() {
		System.out.println("EchoBean 생성자");
	}
	public EchoBean(String mesg) {
		this.mesg = mesg;
		System.out.println("EchoBean 생성자" + mesg);
	}
	public EchoBean(String bbb, int aaa){ 
		System.out.println("EchoBean 생성자" + mesg +"\t" + aaa);
	}
	public EchoBean(String ...bbb){ 
		System.out.println("EchoBean 생성자" + mesg +"\t" +bbb);
	}
}
