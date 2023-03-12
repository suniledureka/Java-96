package co.edureka.threads;

class Printer{
	//public void printTable(int n) {
	synchronized public void printTable(int n) {
		for(int i=1; i<=10; i++) {
			int p = n * i;
			System.out.println(n + " x " + i + " = " + p);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}//for
		System.out.println("--------------------------------------------------------------------");
		try {
			Thread.sleep(5000);
		}catch(Exception ex) {}		
	}
}

class ComputerThread1 extends Thread{
	Printer printer;
	
	public ComputerThread1(Printer printer) {
		this.printer = printer;
	}
	
	public void run() {
		printer.printTable(5);
	}
}

class ComputerThread2 extends Thread{
	Printer printer;
	
	public ComputerThread2(Printer printer) {
		this.printer = printer;
	}
	
	public void run() {
		printer.printTable(6);
	}
}

public class SynchroTest {

	public static void main(String[] args) {
		Printer p = new Printer();
		
		ComputerThread1 ct1 = new ComputerThread1(p);
		ComputerThread2 ct2 = new ComputerThread2(p);
		
		ct1.start();
		ct2.start();
	}
}