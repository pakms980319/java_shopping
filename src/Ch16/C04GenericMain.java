package Ch16;

class Animal {
	
}

class Tiger extends Animal {
	String name;
	
	// 생성자
	public Tiger(String name) {
		super();
		this.name = name;
	}
	
	// toString
	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}
}

class Panda extends Animal {
	String name;

	// 생성자
	public Panda(String name) {
		super();
		this.name = name;
	}
	
	// toString
	@Override
	public String toString() {
		return "Panda [name=" + name + "]";
	}
}

public class C04GenericMain {
	
	// Generic	
	public static <T extends Animal> void PrintInfo(T[] arr) {
		for (T t : arr) {
			System.out.println(t);
		}
	}
	// Object
	public static void PrintInfo2(Object[] arr) {
		for (Object object : arr) {
			if (object instanceof Panda) {
				Panda panda = (Panda) object;
				System.out.println(panda);
			} else if (object instanceof Tiger) {
				Tiger tiger = (Tiger) object;
				System.out.println(tiger);
			}
		}
	}
	
	public static void main(String[] args) {
		Tiger[] arr = {new Tiger("시베리안호랑이"), new Tiger("백두산호랑이"), new Tiger("서양호랑이")};
		PrintInfo(arr);
		
		Panda[] arr2 = { new Panda("중국팬더"), new Panda("한국팬더"), new Panda("쿵푸팬더") };
		PrintInfo(arr2);
		
		Object[] arr3 = {new Tiger("랜덤호랑이"), new Panda("랜덤팬더"), new Tiger("고양이")};
		// PrintInfo(arr3);  확장된 부분에는 접근이 어렵다
		PrintInfo2(arr3);
	}

}