package Ch17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02SetMain {
	public static void main(String[] args) {
		/*
		 * Set
		 * 저장 순서가 유지되지 않는 형태의 저장
		 * 수학의 집합과 유사
		 * 순서와 상관없고 중복이 허용되지 않는다
		 * HashSet, LinkedHashSet, TreeSet 등이 있다
		 * 
		 * 마지막으로 추가되는 중복 데이터가 저장되고 기존 데이터는 덮어져서 삭제되는 형식이다
		 */
		Set<String> set = new HashSet<String>();
		
		// 추가
		set.add("HTML/CSS/JS");				
		set.add("JQUERY");						
		set.add("NODEJS");						
		set.add("SCSS");					
		set.add("REACT");				
		set.add("JAVA");				
		set.add("JSP/SERVLET");		
		set.add("STS");					
		set.add("SPRING BOOT");
		set.add("HTML/CSS/JS");				
		set.add("JQUERY");						
		set.add("NODEJS");						
		set.add("SCSS");					
		set.add("REACT");				
		set.add("JAVA");				
		set.add("JSP/SERVLET");		
		set.add("STS");					
		set.add("SPRING BOOT");
		set.add("HTML/CSS/JS");				
		set.add("JQUERY");						
		set.add("NODEJS");						
		set.add("SCSS");					
		set.add("REACT");				
		set.add("JAVA");				
		set.add("JSP/SERVLET");		
		set.add("STS");					
		set.add("SPRING BOOT");
		set.add("HTML/CSS/JS");				
		set.add("JQUERY");						
		set.add("NODEJS");						
		set.add("SCSS");					
		set.add("REACT");				
		set.add("JAVA");				
		set.add("JSP/SERVLET");		
		set.add("STS");					
		set.add("SPRING BOOT");
		
		// 조회
		System.out.println("개수 확인: " + set.size());
		
		// 삭제
		set.remove("STS");
		System.out.println("개수 확인: " + set.size());
		
		// 전체조회
		
		// 1번 Iterator 방식
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// 2번 foreach 방식
		System.out.println();
		set.forEach(obj -> {
			System.out.println(obj);
		});
		
		// 3번 for 방식
		System.out.println();
		for (String el : set) {
			System.out.println(el);
		}
		
		// 전체 삭제
		set.clear();
	}
}
