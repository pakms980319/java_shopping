package Ch17Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class C02Ex {
	public static void main(String[] args) {
		/*
		 * 1 ~ 45 까지 숫자 6개를 랜덤으로 받아 (Random 클래스를 이용) set에 저장
		 * [추가] 저장된 set을 오름차순 정렬을 해보세요 (검색을 통해서 해결 해봅시다.)
		 */
		Random random = new Random();
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() != 6) {
			set.add( random.nextInt(45) + 1 );
		}
		
		
		// 1. stream 사용
//		set.stream().sorted().forEach(System.out::println);
		set.stream()
			.sorted()
			.collect(Collectors.toList())
			.forEach(System.out::println);
			
		
		// 2. TreeSet 사용
		System.out.println("------------------------");
		Set<Integer> test = new TreeSet<Integer>();
		test.addAll(set);
		test.forEach(obj -> System.out.println(obj));
		
		// 3. ArrayList 사용
		System.out.println("------------------------");
//		List<Integer> list = new ArrayList<Integer>();
//		list.addAll(set);
		List<Integer> list = new ArrayList<Integer>(set);
		
		Collections.sort(list);
		list.forEach(obj -> System.out.println(obj));
		
//		list.sort(Comparator.naturalOrder());
//		list.forEach(obj -> System.out.println(obj));
		
	}
}
