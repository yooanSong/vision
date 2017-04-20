import java.util.List;

import com.service.BoardService;

public class BoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoardService service= new BoardService();
		List<String> list = service.list();
		for(String str: list){
			System.out.println(str);
		}

	}

}
