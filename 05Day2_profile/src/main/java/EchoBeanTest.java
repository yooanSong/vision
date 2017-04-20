import org.springframework.context.support.GenericXmlApplicationContext;

import com.test.Echo;

public class EchoBeanTest {

	public static void main(String[] args) {
		// echo.xml ==> configuration 파일 읽고 관리하는
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		
		ctx.getEnvironment().setActiveProfiles("prod");
		ctx.load("classpath:echoDev.xml","classpath:echoProd.xml");
		ctx.refresh(); //load 메소드 쓸때 꼭 refresh 해줘야함 
		//"dev" 로 설정하면 -> dev로 지정된 애만 활성화가 된다 
		//"prod" 로 설정하면 -> prod로 지정된 애만 활성화가 된다 
		
		Echo echo= ctx.getBean(Echo.class);
		System.out.println(echo.sayEcho("hello"));

	}
}

