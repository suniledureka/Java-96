import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Shape sh = null;
		
		//sh = new Shape("Red"); //Cannot instantiate the type Shape
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which shape you want to work with [1.Rect | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		 case 1:
			 sh = new Rectangle("Blue", 12, 8);
			 break;
		 case 2:
			 sh = new Circle("Yellow", 7.5f);
			 break;			 
		  default:
			 System.out.println("---- INVALID SHAPE SELECTED ----");
			 return;  //System.exit(0);
		}
		
		System.out.println("\n================ SHAPE SELECTED : " + sh.getClass().getName().toUpperCase() + " ================\n");
		
		System.out.println("color of " + sh.getClass().getName() + " = " + sh.getColor());
		sh.area();
		sc.close();
	}
}
