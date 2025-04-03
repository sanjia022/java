package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class RethrowException {
	
	public static void createNewFile() throws Exception {
		File f1 = new File("resources/nonexistent.txt") ;
	/*	try {
			f1.createNewFile();
		} catch (IOException e) {
			System.out.println("Directory is not exist");
			e.printStackTrace();
		}*/
		//Using super class of exception	
		
			f1.createNewFile();
		
		
	}

	public static void main(String[] args) throws Exception {
		createNewFile();

	}

}
