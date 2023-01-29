
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {98,76,65,83,70,68,86};
		
		System.out.println("no of subjects = " + marks.length);
		System.out.println();
		
		/*--- array iteration using for loop ---*/
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for subject-"+(i+1)+ " = " + marks[i]);
		}
		System.out.println();
		
		/*--- array iteration using enhanced for loop from java 5---*/
		System.out.print("marks obtained = ");
		for(int mark : marks) {
			System.out.print(mark+" | ");
			try {
			 Thread.sleep(2000);//2000ms
			}catch(Exception ex) {}
		}
		System.out.println();
		System.out.println(marks[7]); //java.lang.ArrayIndexOutOfBoundsException
	}

}
