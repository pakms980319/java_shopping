package Ch36;

public class Rifle extends Gun {

	Rifle() {
		this.power = 5;
		this.bullitCnt=20;
	}
	
	@Override
	void fire(Unit unit) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++ ) {
			if (this.bullitCnt <= 0) {
				System.out.println("탄약 부족");
				break;
			} else {
				System.out.println("Rifle fire...");
				unit.UnderAttack(this.power);
				this.bullitCnt--;
			}
		}
	}

	@Override
	void reload(int bullitCnt) {
		// TODO Auto-generated method stub
		System.out.println("Rifle reload...");
	}

}
