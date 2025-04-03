package exceptionHandling;

//write the following statement — int c = 30/0 — within a program and execute it. 
//Then print a statement after the division to say, "Division is fun." This statement should be 
//outputted no matter what happens in your program.

public class Exception {
	 public static void printStatement() {
		  
		try { 
			int c;
			  c= 30/0;
		  System.out.println(c);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Division is fun.");
		}
	 }
	

	public static void main(String[] args) {
		
		printStatement();
	}

}
