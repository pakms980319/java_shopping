package Ch36;

interface UnitFactory {
	Unit createUnit();
}

class MarineFactory implements UnitFactory {

	@Override
	public Unit createUnit() {
		// TODO Auto-generated method stub
		return new Marine();
	}
	
}

class MedicFactory implements UnitFactory {

	@Override
	public Unit createUnit() {
		// TODO Auto-generated method stub
		return new Medic();
	}
	
}

public class Barrack {
	private MarineFactory marineFactory;
	private MedicFactory medicFactory;
	
	public Barrack() {
		// TODO Auto-generated constructor stub
		marineFactory = new MarineFactory();
		medicFactory = new MedicFactory();
	}
	
	public Unit getMarine() {
		return marineFactory.createUnit();
	}
	
	public Unit getMedic() {
		return medicFactory.createUnit();
	}
}
