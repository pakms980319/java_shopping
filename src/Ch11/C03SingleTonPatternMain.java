package Ch11;


class Company{
	int n1;
	int n2;
	//싱글톤 패턴 코드
	private static Company instance;
	private Company(){}
	public static Company getInstance() {
		if(instance==null)
			instance =new Company();
		return instance;
	}
	
	@Override
	public String toString() {
		return "Company [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
	
}

public class C03SingleTonPatternMain {

	public static void main(String[] args) {
			
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		com1.n1=100;com1.n2=200;
		
		System.out.println(com2);
	}
}
