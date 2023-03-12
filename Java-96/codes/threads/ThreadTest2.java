package co.edureka.threads;

class MyTask1 extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("thread in run() --> " + t);
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println("thread in main() --> " + t);
		
		MyTask1 task = new MyTask1();
		task.start();
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}
}