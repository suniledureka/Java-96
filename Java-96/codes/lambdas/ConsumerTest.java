package co.edureka.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sanjay", "Parul", "Aby", "Avinash", "Bharath","Surya", "Dennis");
		
		/*
		names.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);				
			}			
		});
		*/
		
		names.forEach(name -> System.out.println(name));
	}

}
