package Ch23;

public class C03Worker2 implements Runnable {

	private C01GUI gui;
	
	public C03Worker2(C01GUI gui) {
		this.gui = gui;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		
		while (true) {
			System.out.println("TASK02..");
			gui.area2.append("Task02\n");
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
