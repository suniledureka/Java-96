package co.edureka.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println(names + " |size="+names.size());
		
		names.add("Sunil");
		names.add("Amol");		
		names.add("Sunil");
		names.add("Anu Preethi");
		names.add("Ashwani");
		names.add("Avinash");
		names.add("Sunil");
		
		System.out.println(names + " |size= "+names.size());
		
		names.add(1, "Aditya");
		names.set(2, "AMOL");
		System.out.println(names + " |size="+names.size());
		
		System.out.println("\"Sunil\" in list = " + names.contains("Sunil"));
		
		System.out.println("indexOf(Sunil) from start = " + names.indexOf("Sunil"));
		System.out.println("lastIndexOf(Sunil) = " + names.lastIndexOf("Sunil"));
		System.out.println("indexOf(Sachin) from start = " + names.indexOf("Sachin"));
		
		System.out.println("person @ index 1 = " + names.get(1));
		//System.out.println("person @ index 10 = " + names.get(10)); //java.lang.IndexOutOfBoundsException
		
		System.out.println("remove(Sunil) --> " + names.remove("Sunil"));
		System.out.println("remove(0) --> " + names.remove(0));
		
		System.out.println(names + " |size="+names.size());
		
		names.clear();
		System.out.println(names + " |size="+names.size());
	}
}