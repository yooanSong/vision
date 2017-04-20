import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.BoardService;

public class BoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:echo.xml");

		BoardService service = ctx.getBean("boardService", BoardService.class);
		List<String> list = service.list();
		for(String str: list){
			System.out.println(str);
		}

	}

}
