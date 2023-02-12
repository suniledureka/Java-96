package co.edureka.io;

import java.io.FileWriter;

public class WriteFile1 {

	public static void main(String[] args) throws Exception {
		FileWriter fout = new FileWriter("src/co/edureka/io/wrapper1.xls", true);
		
		String str = "In Java, an immutable class is a class which once created then its body can not be changed\n";
	
		fout.write(str);
		System.out.println("file saved");
		
		fout.close();
	}

}
