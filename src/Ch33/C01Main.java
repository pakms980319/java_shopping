package Ch33;

@FunctionalInterface
interface Func {
	void say(String massage);
}

@FunctionalInterface
interface Func2 {
	int sum(int n1, int n2);
}

@FunctionalInterface
interface Func3 {
	int sum(int ...args);
}

public class C01Main {
	public static void main(String[] args) {
		Func t1 = (m) -> {
			System.out.println(m);
			};
			
		t1.say("Hello");
		
		Func t2 = System.out::println;
		
		t2.say("bye");
		
		
		Func2 t3 = (n1, n2) -> {
			return n1 + n2;
		};
		System.out.println(t3.sum(10, 20));
		
		Func3 t4 = (numbers) -> {
			int sum = 0;
			for (int n : numbers)
				sum+=n;
			return sum;
		};
		
		System.out.println(t4.sum(1, 2, 3, 4, 5));
	}
}
