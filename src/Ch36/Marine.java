package Ch36;

public class Marine extends Unit {
	
	String name;
	Gun gun;

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("Marine Move...");
	}
	
	public Marine() {this.hp = 100;}
	public Marine(String name) {this();this.name = name;}
	
	public Marine(Gun gun) {
		this();
		this.gun = gun;
	}
	
	public Marine(String name, Gun gun) {
		// TODO Auto-generated constructor stub
		this();
		this.name = name;
		this.gun = gun;
	}
	
	void attack(Unit unit) {
		gun.fire(unit);
	}

	@Override
	void UnderAttack(int damages) {
		// TODO Auto-generated method stub
		System.out.println("Marine UnderAttack...");
		
		if(this.hp-damages < 0) {
			System.out.println("Marine Dead...");
		}
		else
			this.hp-=damages;
		
	}

	@Override
	public String toString() {
		return "Marine [name=" + name + ", gun=" + gun + ", hp=" + hp + ", amor=" + amor + ", type=" + type + "]";
	}
	
}
