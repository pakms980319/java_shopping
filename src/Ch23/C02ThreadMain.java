package Ch23;

class B implements A{
	A a;

	B (A a) {
		this.a = a;
	}
	public B() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void start() {
		a.test();
	}
}

interface A {
	void test();
}

public class C02ThreadMain {
	public static void main(String[] args) throws Exception {
		// ---------------------		
		// -- Runnable 사용
		// ---------------------
		
//		// 01 작업 스레드 객체 생성
//		C02Worker1 worker1 = new C02Worker1();
//		C02Worker2 worker2 = new C02Worker2();
//		
//		// 02 Thread 별 공간 불리
//		Thread th1 = new Thread(worker1);
//		Thread th2 = new Thread(worker2);
//		
//		
//		// 03 스레드 실행
//		th1.start();
//		th2.start();
		
		
		
		// ---------------------
		// Thread 사용
		// ---------------------
//		new Thread() {}.start();
		
//		new Thread() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				int i;
//				
//				for(i=0;i<5;i++) {
//					System.out.println("Worker1 Thread...");
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}		
//			}
//			
//		}.start();
//		
//		
		new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int i;
				
				for(i=0;i<5;i++) {
					System.out.println("Worker2 Thread...");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}		
			}
			
		}.start();
		
		
		new Thread(()-> {}).start();;
		
	
	
		new B(
				() -> {
					System.out.println("Hello World!");
				}
		).start();
		
		System.out.println();
		
	}
	
	
}

