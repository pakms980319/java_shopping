package Ch36;

public class Main {
	
	public static void main(String[] args) {
		Marine m1 = new Marine("마린1", new Pistol());
		Marine m2 = new Marine("마린2", new Rifle());
		
		m1.attack(m2);
		m2.attack(m1);

		
		System.out.println(m1);
		System.out.println(m2);
	}
	
}
