package Ch09;

//this
// 클래스 내에서 사용되는 예약어
// 생성되는 객체의 위치정보(메모리주소-해시코드값)을 확인하는데 사용

//this : 멤버변수와 지역변수 구별에 사용
//this : 다른생성자 호출 사용
class C04Simple{
	int x;
	int y;
	C04Simple(){
//		this.x = 0; 
//		this.y = 0;
		this(0,0);
	}
	C04Simple(int x){
//		this.x = x; 
//		this.y = 0;
		this(x,0);
	}
	C04Simple(int x,int y){
		this.x = x; 
		this.y = y;
	}
	
	C04Simple getThis() {
		return this;
	}
}
public class C04ThisMain {

	public static void main(String[] args) {	

//		C04Simple obj = new C04Simple();
//		System.out.println(obj);
//		System.out.println(obj.getThis());
//		System.out.println();
//		C04Simple obj2 = new C04Simple();
//		System.out.println(obj2);
//		System.out.println(obj2.getThis());
		
		C04Simple ob1 = new C04Simple();
		C04Simple ob2 = new C04Simple(10);
		C04Simple ob3 = new C04Simple(10,20);
	}
}
