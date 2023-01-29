
public class FloatTypes1 {

	public static void main(String[] args) {
		float sal = 2575.75461f;
		System.out.println(sal);
		
		System.out.printf("%.0f", sal);
		System.out.println();
		
		System.out.printf("%.1f", sal);
		System.out.println();	
		
		System.out.printf("%.2f", sal);
		System.out.println();	
		
		System.out.printf("%.3f", sal);
		System.out.println();	
		
		String name = "Sanjay";
		float age=25.5f;
		System.out.printf("Hi %s you are %.2f years of age", name, age);
	}
}