import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		// echo.xml ==> configuration 파일 읽고 관리하는 
		ApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:echo.xml");

		// 생성된 EchoBean 참조 3가지
		EchoBean echo1 = ctx.getBean(EchoBean.class);
		System.out.println(echo1.sayEcho());
		
		EchoBean echo2 =(EchoBean) ctx.getBean("xxx");
		System.out.println(echo2.sayEcho());
		
		EchoBean echo3 =ctx.getBean("xxx", EchoBean.class);
		System.out.println(echo3.sayEcho());
		
		
		
		
	}

}
