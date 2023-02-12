package co.edureka.pack;

public class WrapperTest2 {

	public static void main(String[] args) {
		Integer in = Integer.valueOf(25);
		
		byte b = in.byteValue();
		short s = in.shortValue();
		int n = in.intValue();
		long l = in.longValue();
		
		float f = in.floatValue();
		double d = in.doubleValue();
		
		System.out.println(b + " | " + s + " | " + n + " | " + l);
		System.out.println(f + " | " + d);
		
		int n1 = 26;
		Integer n2 = n1; //auto-boxing
		int n3 = n2; //un-boxing
		System.out.println(n1 + " | " + n2 + " | " + n3);
		
		String str = "125.45";
		float ff = Float.parseFloat(str);
		System.out.println(ff);
		
		Integer nn1 = 127;
		Integer nn2 = 127;
		System.out.println("127==127 ---->" + (nn1 == nn2));
		
		Integer nn3 = 128;
		Integer nn4 = 128;
		System.out.println("128==128 ---->" + (nn3 == nn4));		
	}
}