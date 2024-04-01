package Ch09;

import Ch08.C01Main;


//라면
class 라면Recipe{
	//순서
	private void step1() {System.out.println("1 step");}
	private void step2() {System.out.println("2 step");}
	private void step3() {System.out.println("3 step");}
	private void step4() {System.out.println("4 step");}
	
	//기능묶기
	public void Cooking() {
		step1();
		step2();
		step3();
		step4();
	}
}
//요리사
class Cook{
	public 라면Recipe recipe01;
	Cook(){
		recipe01 = new 라면Recipe();
	}
}

public class C03캡슐화 {
	public static void main(String[] args) {
		Cook hong = new Cook();
		hong.recipe01.Cooking();
		
	}
}




