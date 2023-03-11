package co.edureka;

import co.edureka.services.Nums;
import co.edureka.services.NumsServiceLocator;

public class TestApp {

	public static void main(String[] args) throws Exception {
		NumsServiceLocator locator = new NumsServiceLocator();
		Nums ref = locator.getNums();
		
		System.out.println("sum = " + ref.add(10, 6));
		System.out.println("diff = " + ref.sub(10.5f, 6.3f));
	}

}
