package Ch12;

class Super{
	int n1;
}
class Sub extends Super{
	int n2;
}

public class C04UpDownCastingMain {

	public static void main(String[] args) {
		//NoCasting
		Super ob1 = new Super();
		ob1.n1 = 10;
		Sub ob2 = new Sub();
		ob2.n1 = 10;
		ob2.n2 = 20;
			
		//UpCasting : 상위클래스참조변수 = 하위클래스객체 
		//UpCasting은 상위클래스형으로 형변환을 하는 문법
		//UpCasting은 자동형변환이 된다
		
		Super ob3 = new Sub();
		ob3.n1 = 100;
		//ob3.n2 = 200;
		
		
		//DownCasting : 하위클래스참조변수 = 상위클래스형객체		
		//DownCasting은 하위클래스형으로 형변환을 시도하는 문법
		//DownCasting은 강제형변환을 한다
		
		Sub ob4 = (Sub)ob3;
		ob4.n1=100;
		ob4.n2=200;
		
		
	
		
		
	}
	
}
