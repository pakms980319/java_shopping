package Ch38.Cotroller;

import java.util.HashMap;
import java.util.Map;

public class FrontController {
	Map<String, SubController> api = new HashMap<String, SubController>();
	
	public FrontController() {
		System.out.println("FrontController()");
		init();
	}
	
	void init() {
		System.out.println("FrontController().init()");
		api.put("/book", new BookController());
		api.put("/member", new MemberController());
		api.put("/lend", new LendController());
	}
	
	// 요청 API
	// /book - BookController
	// /member - MemberController
	// /lend - LendController
	
	// 사용자의 요청 uri 에 맞는 subController를 가져와 execute 를 실행
	public Map<String, Object> execute(String uri, int serviceNo, Map<String, Object> params) {
		System.out.println("FrontController().execute()");
		SubController controller = api.get(uri);
		
		return controller.execute(serviceNo, params);
	}
	
}
