import java.util.Map;
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
		Map<String, AnotherBean> map = bean.getXxx();
		
		//key를 얻어오는 keySet()메소드를 사용해서 출력 
		Set<String> keys =map.keySet();
		for(String key : keys){
			AnotherBean a = map.get(key);
			System.out.println(a.getUsername()+"\t"+a.getAge());
		}
		
	}// end main
}// end class
