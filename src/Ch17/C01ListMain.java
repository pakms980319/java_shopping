package Ch17;

import java.util.ArrayList;
import java.util.List;

public class C01ListMain {
	public static void main(String[] args) {
		/*
		 * List 를 순서를 가진 배열 자료구조이다 
		 * List 는 중복 Value 를 허용한다.
		 * 
		 * List 에는 ArrayList, Vector, LinkedList 가 있다
		 * 
		 * List 의 Method
		 * 
		 * add(): 요소의 추가
		 * add( 요소 ) 혹은 add ( 인덱스, 요소 )
		 * 
		 * size(): 요소의 사이즈 리턴
		 * get(인덱스): 해당 인덱스의 값 리턴
		 * indexOf(요소): List 에 해당 요소의 인덱스 번호를 리턴
		 * 
		 * remove(): 요소의 삭제
		 * remove( 요소 ) 혹은 remove( 인덱스 )
		 * 
		 * clear(): 모든 요소 삭제
		 * 
		 * forEach(): 각각의 요소에 접근하는 반복문
		 * 
		 * 
		 * ArrayList 는 데이터 양이 많아질 때
		 * 중간에 삽입, 삭제 연산을 할 때, 뒤의 요소들을 모두 앞에 당겨주는 작업이 필요하다 (O(n)의 시간복잡도 발생)
		 * 
		 * LinkedList 는
		 * 중간에 삽입, 삭제 연산을 할 때, 앞, 뒤 요소의 연결만 수정해주면 된다 (O(1)의 시간복잡도 발생, 오버헤드 X)
		 * => 많은 양의 데이터를 관리할 때 유리하다
		 * 
		 * Vector 는
		 * 멀티 스레드환경에서 안전하게 객체를 추가/삭제할 수 있다
		 * 저장공간에 동시에 접근하는 환경에서 임계영역을 설정하여 하나의 스레드가 접근 중일 때 나머지 스레드의 접근에 락을 건다
		 */
		
		
		// 생성
		List<String> list = new ArrayList<String>();
		
		
		// 추가
		list.add("HTML/CSS/JS");				// 0번 인덱스
		list.add("JQUERY");						// 1번 인덱스
		list.add("NODEJS");						// 2번 인덱스
		list.add("SCSS");						// 3번 인덱스
		list.add("REACT");						// 4번 인덱스
		list.add("JAVA");						// 5번 인덱스
		list.add("JSP/SERVLET");				// 6번 인덱스
		list.add("STS");						// 7번 인덱스
		list.add("SPRING BOOT");				// 8번 인덱스
		
		// 조회
		System.out.println("개수 확인: " + list.size());
		System.out.println("idx로 개별 조회: " + list.get(2));
		System.out.println("Value로 idx 확인: " + list.indexOf("STS"));
		list.forEach(obj -> System.out.println(obj));
		
		// 삭제
		System.out.println();
		list.remove(0);
		list.remove("JQUERY");
		list.forEach(obj -> System.out.println(obj));
		list.clear();  // 전체삭제
		
		
	}
}
