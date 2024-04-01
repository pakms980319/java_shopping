package Ch13;

//명품자바 상속 : https://cs-ssupport.tistory.com/84


//일반클래스 상속관계
class Super1{
	void Func() {};
}
class Son1 extends Super1{
	void Func() {System.out.println("Son1's Function()");};
}
//추상클래스 상속관계
abstract class Super2{
	abstract void Func();
}
class Son2 extends Super2{

	@Override
	void Func() {
		System.out.println("Son2's Function()");
	}
	
}

public class C01AbstractMain {
	
	public static void main(String[] args) {
		//01 
//		Super1 ob1 = new Super1();	//상위클래스 객체 생성 o
//		Son1 ob2 = new Son1();		//하위클래스 객체 생성 o
//		ob1.Func();					//상위클래스에서 하위클래스가 추가한 메서드 접근 x
//									//상위클래스에서 정의한 메서드를 하위클래스에서 재정의한 경우 접근 o
//		++
//		Super1 ob3 = ob2;			//UPCASTING
//		ob3.Func();
		
		//02
		//Super2 ob1 = new Super2();// x
		Son2 ob2 = new Son2();		// o
		
		Super2 ob3 = ob2;			// UPCASTING o
		ob3.Func();
		
	
	}
}
