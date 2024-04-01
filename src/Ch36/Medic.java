package Ch36;

public class Medic extends Unit {

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("Medic Move...");
	}

	@Override
	void UnderAttack(int damages) {
		// TODO Auto-generated method stub
		System.out.println("Medic UnderAttack...");
		
		if(this.hp-damages < 0) {
			System.out.println("Medic Dead...");
		}
		else
			this.hp-=damages;
		
	}
	
}
