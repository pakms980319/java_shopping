package Ch16;

import Ch09.C04ThisMain;


class 재료{
	
}

class 팥 extends 재료{
	private String meterial; 
	
	팥(String meterial){
		this.meterial = meterial;
	}
	@Override
	public String toString() {
		return "팥 [meterial=" + meterial + "]";
	}

}
class 야채 extends 재료{
	@Override
	public String toString() {
		return "야채 []";
	}
}
class 슈크림 extends 재료{
	@Override
	public String toString() {
		return "슈크림 []";
	}
}
class 민초{
	@Override
	public String toString() {
		return "민트초코 []";
	}
}

class 호빵<T extends 재료>{
	private T meterial; 
	
	호빵(T meterial){
		this.meterial = meterial;
	}
	void showInfo() {
		System.out.println(meterial+" 으로 만든 호빵!");
	}
}

public class C01GenericMain {

	
	public static void main(String[] args) {
		호빵<팥> ob1 = new 호빵<팥>( new 팥("단팥") );
		ob1.showInfo();
		
		호빵<야채> ob2 = new 호빵<야채>( new 야채() );
		ob2.showInfo();
		
		호빵<슈크림> ob3 = new 호빵<슈크림>( new 슈크림() );
		ob3.showInfo();
		
//		호빵<민초> ob4 = new 호빵<민초>( new 민초() );
//		ob4.showInfo();
	}
	
}
