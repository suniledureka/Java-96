package co.edureka.pack;
import static java.lang.Math.*;
import static java.lang.System.out;

public class MathTest {

	public static void main(String[] args) {
		out.println(E);
		out.println(PI);
		
		out.println(sin(0));
		out.println(cos(0));
		out.println(sqrt(25));
		System.out.println(abs(-10));
		
		System.out.println(round(10.5));
		System.out.println(round(10.4));
		
		System.out.println(floor(10.1));//10.0
		System.out.println(ceil(10.1));//11.0
		
		double random = random();
		System.out.println(random);
		int otp = (int)(random*10000);
		System.out.println("OTP = " + otp);
	}
}
