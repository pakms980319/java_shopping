package Ch35;

@C01Interface(value="HELLO WORLD", number=5)
class A {
	String value;
	int num;
	
	public A() {
		C01Interface test = this.getClass().getAnnotation(C01Interface.class);
		
		this.value = test.value();
		this.num = test.number();
		
		System.out.println("A() value: " + test.value());
		System.out.println("A() num: " + test.number());
	}

	@Override
	public String toString() {
		return "A [value=" + value + ", num=" + num + "]";
	}
	
	
}

class B {
	String value;
	int num;
}

public class C01Main {
	public static void main(String[] args) {
		System.out.println( new A() );
	}
}
