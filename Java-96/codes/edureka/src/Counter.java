
class Counter {
	//int n = 10;
	static int n = 10;
	
	Counter(){
		System.out.println("constructor");
	}
	
	void inc() {
		n = n + 1;
	}
	/*-- initialization block --*/
	{
		System.out.println("initialization block");
	}
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();

		obj1.inc();
		obj2.inc();
		obj3.inc();

		System.out.println(obj1.n);
		System.out.println(obj2.n);
		System.out.println(obj3.n);
	}
}
