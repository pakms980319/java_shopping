package Ch12;


class C06Super{
	void func1() {System.out.println("C06Super Func1 호출!");}
}

class C06Sub extends C06Super{
	void func1() {System.out.println("C06Sub Func1 호출!");}
	void func2() {System.out.println("C06Sub Func2 호출(extends..)!");}
}

public class C06UpdDownCastingOverringMain {	
	
	
	public static void main(String[] args) {
		
		C06Super ob1 = new C06Super();
		ob1.func1();
		
		C06Sub ob2 = new C06Sub();
		ob2.func1();
		
		C06Super ob3 = new C06Sub();
		//ob3.func2();		//
		ob3.func1();
		
		//UPCASTING
		// 상위클래스형 참조변수 = 하위클래스형객체
		// 확장된(추가된) 멤버변수 접근가능? X -> DOWNCASTING
		// 확장된(추가된) 멤버메서드 접근가능? X -> DOWNCASTING
		// 재정의된 메서드 접근가능? O
		
		
	}
	
	
}
