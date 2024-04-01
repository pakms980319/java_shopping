package Ch14;

import java.util.Scanner;

class A{
	int x;
	int y;
	
	@Override
	public String toString() {
		return "X = " + x + " Y = " + y;
	}
}
public class C01ObjectMain {

	
	public static void main(String[] args) {
		
		
		Object ob = new Object();
		
		
		System.out.println(ob);
		System.out.println(ob.toString());

		
		A ob2 = new A();
		System.out.println(ob2);
		System.out.println(ob2.toString());	
		
		
		
	}
	
	
}
