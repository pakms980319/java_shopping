package Ch08;


//클래스 선언시 생성자함수를 1개이상 명시하게 되면 디폴트생성자가 자동주입되지 않으니 주의!

class C09Simple{
	int num;

	C09Simple(){}
	public C09Simple(int num) {
		super();
		this.num = num;
	}
	
//	C09Simple(int num){this.num = num;}	
}
public class C09ConstructorMain {

	public static void main(String[] args) {
		
		C09Simple ob = new C09Simple();
	}
}
