package Ch38.Cotroller;

import java.util.Map;

public class MemberController implements SubController {

	/*	ServiceNo
	 * 1 Insert
	 * 2 Update
	 * 3 Delete
	 * 4 SelectAll
	 * 5 Select
	 * 
	 * Login, Logout
	 */
	@Override
	public Map<String, Object> execute(int serviceNo, Map<String, Object> params) {
		// TODO Auto-generated method stub
		System.out.println("MemberController execute()");
		
		return null;
	}
	
}
