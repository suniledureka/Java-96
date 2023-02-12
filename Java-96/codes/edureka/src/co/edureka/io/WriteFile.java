package co.edureka.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/wrapper.txt");
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/io/wrapper.txt", true); //tru - appending mode
		
		String str = "In Java, an immutable class is a class which once created then its body can not be changed";
		byte[] b = str.getBytes(); //to convert a String to byte array
		
		fout.write(b);
		System.out.println("file saved");
		
		fout.close();
	}

}
