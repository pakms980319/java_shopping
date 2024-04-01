package Ch15;

class A{
	public void Ex1() throws NullPointerException {
		throw new NullPointerException("NULLException");
	}
}
class B{
	
	public void Ex2(A a) {
		try {
			a.Ex1();
		}catch(Exception e){
			System.out.println("B.Ex2 Function's Exception ..");
		}
	}
}

public class C05ThrowAndThrowsMain {

	
	public static void main(String[] args) {
		
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		A a = new A();
		B b = new B();
			
		b.Ex2(a);
		
		System.out.println("실행코드3");
		
	}
}
