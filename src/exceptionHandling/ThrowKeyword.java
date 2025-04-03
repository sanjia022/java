package exceptionHandling;

public class ThrowKeyword {
	
	 public static void printStatement (int divisor) {
		  
		if(divisor == 0) {
			 throw new ArithmeticException("Division by zero is not possible");
		 }
		 int c = 30 % divisor;
	        System.out.println(c);
	 }
	public static void main(String[] args) {
		printStatement(8);
		

	}

}
