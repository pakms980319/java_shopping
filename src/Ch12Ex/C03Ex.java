package Ch12Ex;
class Employee{
	public String name;
	private int age;
	private String addr;
	
	public Employee(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
class Parttimer extends Employee{
	private int hour_pay;
	public Parttimer(String name, int age, String addr,int hour_pay) {
		super(name, age, addr);
		this.hour_pay = hour_pay;
	}
	public void setHour_pay(int hour_pay) {
		this.hour_pay = hour_pay;
	}
	@Override
	public String toString() {
		return "Parttimer [hour_pay=" + hour_pay + ", name=" + name + ", getAge()=" + getAge() + ", getAddr()="
				+ getAddr() + "]";
	}
	
	
}


class Regular extends Employee{

	private int salary;
	public Regular(String name, int age, String addr,int salary) {
		super(name, age, addr);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", name=" + name + ", getAge()=" + getAge() + ", getAddr()=" + getAddr()
				+ "]";
	}	
	
}


public class C03Ex {

	public void showInfo() {
		//Employee 의 하위클래스형 객체들을 받을수있도록 Upcasting
		//하위클래스형(Regular,Parttimer)로 다운캐스팅후 정보확인(System.out.println)
	}
	
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동",25,"대구",20000);
		Regular emp2 = new Regular("서길동",45,"울산",50000000);
		showInfo(emp1);
		showInfo(emp2);
	}
}
