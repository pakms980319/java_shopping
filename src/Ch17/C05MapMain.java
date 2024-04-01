package Ch17;

import java.util.HashMap;
import java.util.Map;

class AuthController {
	// ID, PW 저장
	private static Map<String, Integer> map = new HashMap<String, Integer>();
	
	// CRUD
	public static boolean Insert(String id, Integer pw) {
		if ( map.containsKey(id) ) {
			System.out.println("[ERROR]동일한 ID가 존재합니다 : " + id);
			return false;
		} else {
			map.put(id, pw);
			return true;
		}
	}
	
	public static Integer Select(String id) {
		return map.get(id);
	}
	
	public static Map<String, Integer> SelectAll() {
		return map;
	}
	
	public static boolean Update(String id, Integer pw) {
		map.replace(id, pw);
		return true;
	}
	
	public static boolean Delete(String id) {
		map.remove(id);
		return true;
	}
}

public class C05MapMain {
	public static void main(String[] args) {
		
		// INSERT
		System.out.println("Insert");
		AuthController.Insert("aaa", 111);
		AuthController.Insert("bbb", 222);
		AuthController.Insert("bbb", 222);
		AuthController.Insert("ccc", 333);
		AuthController.Insert("ddd", 444);
		System.out.println("...Done\n\n");
		
		// SELECT
		System.out.println("검색 ID: " + "ccc");
		System.out.println( AuthController.Select("ccc") );
		System.out.println("...Done\n\n");
		
		// SELECT ALL
		Map<String, Integer> returndResult = AuthController.SelectAll();
		returndResult.forEach((key, value) -> {
			System.out.println("key: " + key + "\t" + "value: " + value);
		});
		System.out.println("...Done\n\n");
		
		// UPDATE
		
		// DELETE
	}
}
