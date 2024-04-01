package Ch14;

import java.util.Objects;

class C03Simple{
	
	
	private int id;
	
	C03Simple(int id){
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C03Simple) {
			C03Simple down = (C03Simple)obj;
			return this.id == down.id;
		}
		return false;
	}
		
};

public class C03ObjectHashCode {	
	
	public static void main(String[] args) {
			
		C03Simple ob = new C03Simple(1);
		System.out.println(ob.toString());
		System.out.printf("%x\n",ob.hashCode());
		System.out.println();
		
		
		C03Simple ob2 = new C03Simple(5);
		System.out.println(ob2.toString());
		System.out.printf("%x\n",ob2.hashCode());
		System.out.println();
		
		C03Simple ob3 = new C03Simple(1);
		System.out.println(ob3.toString());
		System.out.printf("%x\n",ob3.hashCode());
		System.out.println();
		
		System.out.println( System.identityHashCode(ob) );
		System.out.println( System.identityHashCode(ob2) );
		System.out.println( System.identityHashCode(ob3) );
		
	}

}
