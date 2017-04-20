import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		// echo.xml ==> configuration 파일 읽고 관리하는
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");

		EchoBean echo = ctx.getBean("xxx", EchoBean.class);
		EchoBean echo2 = ctx.getBean("xxx", EchoBean.class);
		System.out.println(echo == echo2); //주소값 비교한것 
		System.out.println(echo.sayEcho());

	}
}
