import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EchoBeanTest {

	public static void main(String[] args) {
		// echo.xml ==> configuration 파일 읽고 관리하는 
		ApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:echo.xml");

	}

}
