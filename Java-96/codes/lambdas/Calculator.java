package co.edureka.lambdas;

public class Calculator {

	public static void main(String[] args) {
		Nums numsRef1 = (int x, int y) -> {
							return x+y;
						};
		System.out.println("sum = " + numsRef1.add(5, 7));				

		Nums numsRef2 = (x, y) -> {return x+y; };
		System.out.println("sum = " + numsRef2.add(6, 4));
		
		Nums numsRef3 = (x, y) -> x + y ;
		System.out.println("sum = " + numsRef3.add(6, 5));		
	}

}
