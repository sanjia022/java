package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static void createNewFile() {
		File f1 = new File("resources/nonexistent.txt") ;
	/*	try {
			f1.createNewFile();
		} catch (IOException e) {
			System.out.println("Directory is not exist");
			e.printStackTrace();
		}*/
		//Using super class of exception	
		try {
			f1.createNewFile();
		} catch (Exception e) {
			System.out.println("Directory is not exist");
			e.printStackTrace();  // if i wan to print out what is causing the exception
		}
	}
  public static void numbersExceptionHandling() {
	  File f1 = new File("");
	  Scanner fileReader = null;
	  try {
		  fileReader = new Scanner(f1);
		while(fileReader.hasNext()) {
			double num = fileReader.nextDouble();
			System.out.println(num);
		}
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();// print stact :Information about the exception and the path that the code took
	}
	  catch(InputMismatchException e) {
		  e.printStackTrace();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  finally {
		  fileReader.close();
	  }
		  
  }
	public static void main(String[] args) {
		createNewFile();
		numbersExceptionHandling();

	}

}
