package co.edureka.except;

public class ThrowsTest {

	public static void main(String[] args) throws InterruptedException {
		UserServices uService = new UserServices();
		try {
			String email = uService.findEmailByUserId(101);
			System.out.println(email);
		}catch(Exception ex) {}
		
		System.out.println();
		System.out.println("please wait for 5 seconds");
		Thread.sleep(5000);
		System.out.println("thanks for waiting");
	}

}
