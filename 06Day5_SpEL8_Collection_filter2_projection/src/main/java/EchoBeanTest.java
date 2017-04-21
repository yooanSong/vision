import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.AnotherBean;
import com.test.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		
		// IoC Container ==> ApplicationContext
          ApplicationContext ctx =
       new GenericXmlApplicationContext("classpath:echo.xml");
          
          EchoBean bean = ctx.getBean("echo",EchoBean.class);
          List<String> list = bean.getList();
          for (String a : list) {
			System.out.println(a);
		  }
	}//end main
}//end class






