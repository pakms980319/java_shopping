package Ch23;

public class C03Worker1 implements Runnable {

	private C01GUI gui;
	
	public C03Worker1(C01GUI gui) {
		this.gui = gui;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		
		
		while (true) {		
			try {
				System.out.println("TASK01..");
				gui.area1.append("TASK01\n");
				Thread.sleep(500);
			}  catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
	
}
