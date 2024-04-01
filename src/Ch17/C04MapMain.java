package Ch17;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C04MapMain {
	public static void main(String[] args) {
		/*
		 * 
		 */
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 추가
		map.put("aaa", 1234);
		map.put("bbb", 5555);
		map.put("ccc", 3333);
		map.put("ddd", 4444);
		map.put("ddd", 5555);
		map.put("ddd", 1111);
		
		// 삭제
		map.remove("aaa");
		
		// 개수
		System.out.println("SIZE: " + map.size());
		

		// 조회(단건)
		System.out.println( map.get("bbb") );
		
		// 전체 확인
		for (String key : map.keySet()) {
			System.out.println("key, value: " + key + ", " + map.get(key));
		}
		
		Map<String, Integer> test = new TreeMap<String, Integer>(map);
		test.forEach((k, v) -> {
			System.out.println(k + v);
		});
	}
}
