package co.edureka.pack;

import co.edureka.pack1.Nums;

public class PackTest {

	public static void main(String[] args) {
		Nums obj = new Nums();
		obj.add(10, 20);
		
		System.out.println("diff = " + obj.sub(10, 20));
	}
}