package co.edureka.lambdas;

public class ThreadTest {

	public static void main(String[] args) {
		//--- anonymous class implementation
		Thread ct = new Thread(new Runnable() {
			public void run() {
			 for(int i=1; i<=5; i++) {	
				System.out.println(Thread.currentThread().getName()+ " - " + i);
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {}
			 }
			 System.out.println("\n");
			}
		});

		ct.start();
		
		
		//--- lambda implementation
		Thread ct1 = new Thread(() -> {
			 for(int i=1; i<=5; i++) {	
				System.out.println(Thread.currentThread().getName()+ " - " + i);
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {}
			 }
			});
		
		ct1.start();
	}
}