package Ch36;

public abstract class Unit {
	int hp;
	int amor;
	String type;
	
	abstract void move();
	abstract void UnderAttack(int damages);
}
