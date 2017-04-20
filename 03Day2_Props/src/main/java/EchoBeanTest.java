import java.util.Properties;
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
		Properties props = bean.getXxx();
		
		Set<String> keys = props.stringPropertyNames();
		for(String key : keys){
			String value = props.getProperty(key);
			System.out.println(key+"="+value);
		}
	}// end main
}// end class
