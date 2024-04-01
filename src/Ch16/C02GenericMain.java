package Ch16;

class 팝콘재료 {
	
}

class 캬라멜 extends 팝콘재료 {

	@Override
	public String toString() {
		return "캬라멜 []";
	}
	
}

class 버터옥수수 extends 팝콘재료 {

	@Override
	public String toString() {
		return "버터옥수수 []";
	}

}

class 오징어 {

	@Override
	public String toString() {
		return "오징어 []";
	}

}

class PopCorn<T extends 팝콘재료> {
	private T meterial;
	
	public PopCorn(T meterial) {
		this.meterial = meterial;
	}

	@Override
	public String toString() {
		return "PopCorn [" + meterial + " 맛 팝콘]";
	}
}

public class C02GenericMain {
	public static void main(String[] args) {
		PopCorn<캬라멜> ob1 = new PopCorn<캬라멜>(new 캬라멜());
		System.out.println(ob1);
		PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
		System.out.println(ob2);
//		PopCorn<오징어> ob3 = new PopCorn<오징어>(new 오징어());
//		System.out.println(ob3);
	}
}