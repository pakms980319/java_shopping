package Ch34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//01 func1완성 - List<String>에 저장된 문자열 리스트에서 길이가 5이상인 문자열의 개수를 반환
//02 func2완성 - List<Integer>에 저장된 숫자들의 제곱한 값의 합을 반환
//03 func3완성 - List<String>에서 각 문자열의 첫 글자를 추출하여 대문자로 변환하여 리턴
public class C04Ex {
	
	public static Function<List<String>,Integer> func1 = (items) -> {
		return items.stream()
					.filter(item -> item.length() > 5)
					.map(item -> 1)
					.reduce((a, b) -> a + b)
					.get();
	};
	
	public static Function<List<Integer>,Integer> func2 = (list) -> {
		return list.stream()
					.map(num -> num*num)
					.reduce((a,b) -> a+b)
					.get();
	};
	public static Function<List<String>,List<String>> func3 = (items) -> {
		return items.stream()
					.map(item -> Character.toUpperCase(item.charAt(0)) + item.substring(1))
					.collect(Collectors.toList());
	};
	
	public static void main(String[] args) {
		List<String> test1 = new ArrayList<String>();
		test1.add("abcdefg");
		test1.add("bbcdefg");
		test1.add("cbcdefg");
		test1.add("dbcdefg");
		test1.add("ebcdefg");
		test1.add("fbcd");
		
		System.out.println(
				func1.apply(test1)
		);
		
		List<Integer> test2 = new ArrayList<Integer>();
		test2.add(1);
		test2.add(2);
		test2.add(3);
		test2.add(4);
		test2.add(5);
		System.out.println(
				func2.apply(test2)
		);
		
		System.out.println(func3.apply(test1));
		
	}
}
