import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Person;
import com.service.MyService;

import javassist.ClassPath;

public class BoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx= new GenericXmlApplicationContext("classpath:board.xml");
		
		MyService service = ctx.getBean("boardService", MyService.class);
		List<String> listBoard = service.listBoard();
		for(String str : listBoard){
			System.out.println(str);
		}
		
		MyService service2 = ctx.getBean("personService", MyService.class);
		List<Person> listPerson = service.listPerson();
		for(Person str : listPerson){
			System.out.println(str.getUsername()+"\t"+str.getAge());
		}
		

	}

}
