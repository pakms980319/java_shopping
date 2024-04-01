package Ch13;



interface A{
	void a();
}
interface B{
	void a();
}

class E{
	void a(){ System.out.println("E");};
}
class F{
	void a(){System.out.println("F");};
}

//class C implements A,B
//	@Override
//	public void a() {
//		System.out.println("AA");
//	}
//	
//}

class C implements A, B {
	public void a() {
		System.out.println("AA");
	}
}


public class C04InterfaceMain {

	public static void main(String[] args) {
//		C c  =  new C();
//		c.a();
//		
//		A a = c;
//		a.a();

		
	}
}
