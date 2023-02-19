package co.edureka.util;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new TreeMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 25000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //25000.0
		System.out.println(bank.put("Sanjay", 12500.5f)); //null	
		bank.put("Praveen", 25750f);
		bank.put("Charles",24000.25f);
		bank.put("Rahul", 12750.50f);
		bank.put("Shankar", 45000f);
		
		System.out.println(bank);
		System.out.println();

		//bank.put("Bharath", null);
		bank.put(null, 25000f); //java.lang.NullPointerException
		System.out.println(bank);
		
	}

}
