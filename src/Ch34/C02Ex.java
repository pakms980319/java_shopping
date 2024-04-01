package Ch34;

import java.util.Arrays;

interface functional{
	int execute(int ...args);
}
class Calc{
	functional sum;
	functional sub;
	functional mul;
	functional div;
	
	Calc(){
		//덧셈로직
		sum = (numbers)->Arrays.stream(numbers).reduce((a,b)->a+b).getAsInt();
		//뺄셈로직
		sub = (numbers)->Arrays.stream(numbers)
								.sorted()
								.reduce((a,b) -> b-a)
								.getAsInt();
		//곱셈로직
		mul = (numbers)->Arrays.stream(numbers).reduce((a,b) -> a*b).getAsInt();
		//나눗셈로직
		div = (numbers)->Arrays.stream(numbers).reduce((a,b)->a/b).getAsInt();
	}
}

public class C02Ex {

	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println("합 :"+ calc.sum.execute(10,20,30,40,50,60));
		System.out.println("합 :"+ calc.sub.execute(10,20,30,40,50,60));
		System.out.println("합 :"+ calc.mul.execute(10,20,30,40,50,60));
		System.out.println("합 :"+ calc.div.execute(10,20,30,40,50,60));
		
		
		
	}
}
