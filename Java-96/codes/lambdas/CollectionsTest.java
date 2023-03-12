package co.edureka.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sanjay", "Parul", "Aby", "Avinash", "Bharath","Surya", "Dennis");
		System.out.println(names);
		
		//Collections.sort(names);
		/*
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}			
		});
		*/
		Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

		System.out.println(names);
	}

}
