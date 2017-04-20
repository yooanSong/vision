import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {

		//main에서 messageSource를 썼다 
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");

		String mesg= ctx.getMessage("hello", null, Locale.ENGLISH);
		System.out.println(mesg);
		
		String mesg2= ctx.getMessage("hello2", new String[]{"홍길동","이순신"}, Locale.ENGLISH);
		System.out.println(mesg2);
		

	}
}
