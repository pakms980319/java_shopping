package Ch34;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Func1 {
	int sum(int ...args);
}

@FunctionalInterface
interface Func2 {
	int sum(int ...args);
}

@FunctionalInterface
interface Func3 {
	int sum(int ...args);
}

@FunctionalInterface
interface Func4 {
	List<Integer> sum(int ...args);
}

public class C01Main {
	public static void main(String[] args) {
		Func4 t5 = (numbers) -> {
			return Arrays.asList(
					Arrays.stream(numbers)
						.boxed()
						.sorted((a, b) -> {return a-b;})
						.toArray(Integer[]::new)
					);
		};
		List<Integer> result = t5.sum(55, 11, 251, 9, 15, 2, 1, 67);
		System.out.println(result);
	}
}
