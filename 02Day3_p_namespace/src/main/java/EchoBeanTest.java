import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		// echo.xml ==> configuration 파일 읽고 관리하는 
		ApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:echo.xml");

		EchoBean xxx = ctx.getBean("xxx",EchoBean.class);
		System.out.println(xxx.getMesg()+"\t"+xxx.getAge());
		
	}

}
