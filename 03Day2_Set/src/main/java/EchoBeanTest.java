import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.AnotherBean;
import com.test.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {

		// IoC Container ==> ApplicationContext
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");

		EchoBean bean = ctx.getBean("echo", EchoBean.class);
		Set<AnotherBean> list = bean.getXxx();
		for (AnotherBean a : list) {
			System.out.println(a.getUsername() + "\t" + a.getAge());
		}
	}// end main
}// end class
