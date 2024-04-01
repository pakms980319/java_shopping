package Ch17;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class C02ListMain {
	
	static Scanner sc = new Scanner(System.in);
	
	public static List<String> func1(List<String> list) {
		// ArrayList에 있는 정수값을 입력받는데 전달되는 수중에
		// 짝수의 값만 입력받는 코드를 작성하세요. 받을땐 문자열로 입력받는다
		// func3 함수 완성하기
		int tmp = 0;
		
		while (true) {
			try {
				System.out.println("입력(종료: -1): ");
				tmp = sc.nextInt();
				
				if(tmp == -1) {
					break;
				} else if (tmp % 2 == 0) {
					list.add(String.valueOf(tmp));
				} else {
					System.out.println("[Exception: 짝수만 입력가능합니다.");
				}
			} catch (InputMismatchException e) {
				sc.next();
				System.out.println("정수형 짝수 데이터만 입력가능합니다.");
			}
		}
		
		System.out.println("입력을 마쳤습니다.");
		
		return null;
	}
	
	public static List<String> func2(List<String> list) {
		// ArrayList 에 있는 문자열 중에서 길이가 5보다 큰 문자열만 필터링해서 리턴하는 함수를 만드세요.
		List<String> filteredList = new ArrayList<String>();
		
		list.forEach(obj -> {
			if (obj.length() > 5) {
				filteredList.add(obj);
			}
		});
		
//		for (String el : list) {
//			if(el.length() <= 5) {
//				list.remove(el);
//			}
//		}
		
		return filteredList;
	}
	
	public static int func3(List<String> list) {
		// ArrayList 에 있는 문자열 중에서 숫자형 데이터만 추출해서 합을 구해보세요.
		int sum = 0;
		
		try {
			for (String obj : list) {
				sum += Integer.parseInt(obj);
			}
	
		} catch (Exception e) {
			System.out.println("문자열 데이터가 확인됐습니다.");
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();	
		func1(li);
		System.out.println("func1");
		li.forEach(num -> System.out.print(num + " "));
		System.out.println();
		
		List<String> returnedList = func2(li);
		System.out.println("func2");
		returnedList.forEach(num -> System.out.print(num + " "));
		System.out.println();
		
		
		int result = func3(returnedList);
		System.out.println("func3");
		System.out.println(result);
	}
}
