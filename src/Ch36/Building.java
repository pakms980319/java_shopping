package Ch36;

public abstract class Building {
	int hp;
	int sheld;
	int armor;
	
	abstract void BuildStructure();
	abstract void UnderAttack(Unit unit);
}
