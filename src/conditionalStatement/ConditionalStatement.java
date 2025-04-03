package conditionalStatement;

import java.util.Scanner;

public class ConditionalStatement {
	
	static String gender1 ="female";
	//static String male = null;
	

	public static void main(String[] args) {
		System.out.println("Enter your gender");
		Scanner s1 = new Scanner (System.in);
		String gender = s1.next();
		
		if(gender.equalsIgnoreCase(gender1)) {
			System.out.println("Ticket is free");
		}
		
		else {
			System.out.println("Enter your age");
			int age = s1.nextInt();
			if(age <=12) {
				System.out.println("Your ticket price is half");
			}
			     else if (age >12 && age <60) {
				System.out.println("Ticket price is full");
			}
			else {
				System.out.println("You will get senior citizen discount");
			}
		}
			
		s1.close();

	}

}
