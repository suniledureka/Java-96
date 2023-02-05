
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka limited";
		
		System.out.println("size = " + str.length());
		System.out.println("character @ index 0 = " + str.charAt(0));
		//System.out.println("character @ index 15 = " + str.charAt(15)); //java.lang.StringIndexOutOfBoundsException
		
		System.out.println("indexOf(e) ---> " + str.indexOf("e"));
		System.out.println("indexOf(e,1) ---> " + str.indexOf("e", 1));
		System.out.println("lastIndexOf(e) ---> " + str.lastIndexOf("e"));
		System.out.println("indexOf(z) ---> " + str.indexOf("z")); //-1
		System.out.println("indexOf(limited) ---> " + str.indexOf("limited"));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.replace('e', '*'));
		
		String s1 = new String("Java");
		//String s2 = new String("Java");
		String s2 = new String("java");
		System.out.println("s1==s2 ---> " + (s1==s2));
		System.out.println("equals() ---> " + s1.equals(s2));
		System.out.println("contentEquals() ---> " + s1.contentEquals(s2));
		System.out.println("equalsIgnoreCase() ---> " + s1.equalsIgnoreCase(s2));
		
		str = "   ja  va   ";
		System.out.println("size = " + str.length());
		str = str.trim();
		System.out.println("size = " + str.length());
	}
}
