package co.edureka.threads;

class MyTask implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("thread in run() --> " + t);
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println("thread in main() --> " + t);
		
		MyTask task = new MyTask();
		Thread ct = new Thread(task);
		ct.start();
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}
}