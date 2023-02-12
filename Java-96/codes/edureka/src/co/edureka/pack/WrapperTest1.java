package co.edureka.pack;

public class WrapperTest1 {

	public static void main(String[] args) {
		Integer i1 = new Integer(23);
		Integer i2 = new Integer("23");
		Integer i3 = Integer.valueOf(23);
		Integer i4 = Integer.valueOf("23");
		
		System.out.println(i1 + " | " + i2 + " | " + i3 + " | " + i4);
		
		Character c1 = new Character('A');
		Character c2 = Character.valueOf('A');
		System.out.println(c1 + " | " + c2);
	}
}