import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");
		
		EchoBean bean = ctx.getBean("echo", EchoBean.class);
		System.out.println(bean.getDriver());
		

	}

}
