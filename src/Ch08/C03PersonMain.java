package Ch08;



class C03Person{
	//속성
	String name;
	int age;
	float height;
	double weight;
	//기능
	//말하다
	void talk() {
		System.out.println(this.name + " 이 말합니다.");
	}
	//걷다
	void walk() {
		System.out.println(this.name + " 이 걷습니다.");
	}
	//정보확인
	void showInfo() {
		System.out.printf("%s %d %f %f\n",name,age,height,weight);
	}
	//정보확인
	@Override
	public String toString() {
		return "C03Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
}

public class C03PersonMain {

	public static void main(String[] args) {
		C03Person hong = new C03Person();
		hong.name ="홍길동";
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight=70.4;
		hong.talk();
		hong.walk();
		hong.showInfo();
		System.out.println("-----------------");
		System.out.println(hong);
		

	}

}
