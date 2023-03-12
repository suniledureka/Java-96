package co.edureka.threads;

public class MainThread {

	public static void main(String[] args) {
		int noOfThreads = Thread.activeCount();
		System.out.println("no of active threads = " + noOfThreads);
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("thread name = " + t.getName());
		System.out.println("thread priority = " + t.getPriority());
		System.out.println("thread group = " + t.getThreadGroup());
		
		t.setName("edureka");
		t.setPriority(10);
		//t.setPriority(11);
		System.out.println(t);
	}
}