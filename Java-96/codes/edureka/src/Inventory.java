
public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		
		prod.setProductId(100123);
		prod.setProductName("Mobile Phone");
		prod.setProductPrice(65750f);
		
		System.out.println(prod.getProductId() + " | " + prod.getProductName() + " | " + prod.getProductPrice());		
				
		System.out.println("prod is of type ---> " + prod.getClass().getName());
		System.out.println("hashCode of prod --> " + prod.hashCode());
		System.out.println("hashCode in hex from --> " + Integer.toHexString(prod.hashCode()));
		
		System.out.println(prod); //toString()
	}
}