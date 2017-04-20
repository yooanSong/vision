import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;
import com.service.BoardService;
import com.service.PersonService;

public class BoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx= new GenericXmlApplicationContext("classpath:board.xml");
		
		BoardService service= ctx.getBean("boardService", BoardService.class);
		List<String> list = service.list();
		for(String str: list){
			System.out.println(str);
		}
		
		PersonService service2= ctx.getBean("personService", PersonService.class);
		List<Person> list2 = service2.list();
		for(Person str: list2){
			System.out.println(str.getUsername()+"\t"+str.getAge());
		}

	}

}
