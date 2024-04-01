package Ch23;

public class C01ThreadMain {
	public static void main(String[] args) throws Exception {
		int i;
		
		for (i=0;i<5;i++) {
			System.out.println("TASK01..");
			Thread.sleep(500);
		}
		for (i=0;i<5;i++) {
			System.out.println("TASK02..");
			Thread.sleep(500);
		}
	}
}
