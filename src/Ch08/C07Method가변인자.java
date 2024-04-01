package Ch08;

class Simple07{
	
	int sum(int ...arg) {
		//System.out.println(arg);
		for(int num :arg) {
			System.out.print(num + " ");
		}
		return 0;
	}
	
	// 가변인자 vs 오버로딩
	// 공 : 
	// 차 : 
	
}

public class C07Method가변인자 {

	public static void main(String[] args) {
		
		Simple07 obj = new Simple07();
		obj.sum(10);
		System.out.println();
		obj.sum(11,22);
		System.out.println();
		obj.sum(13,23,44);
		System.out.println();
		obj.sum(13,23,44.5);
	}

}
