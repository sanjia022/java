package method;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

public class Variable_Scope {
	
	
	static Scanner s1 = new Scanner(System.in);
	static double requiredSalaryLimit = 25000;
	static int creditScoreLimit = 700;
    static double salary;
    static int creditScore;

	public static double getSalary() {

		System.out.println("Enter your salary");
		salary = s1.nextDouble();
		return salary;
		
	}
	public static int getCreditScore() {


		System.out.println("Enter your credit score");
		creditScore = s1.nextInt();
		return creditScore;
	}	
	
		
		

     public static boolean isUserQualified(double sal, int score) {
    	 if (salary >= requiredSalaryLimit && creditScore >= creditScoreLimit) {
    		 return true;
    		 }
    		 else {
    			 return false;
    		 }
    	 
     }
     
     public static void notifyUser(boolean q) {
    	 if(q ) {
		
			System.out.println("You are eligible for loan");
			
		} else {
			System.out.println("You are not eligible for loan");;
			
		}

		
     }
    
	public static void main(String[] args) {
		
		double s = getSalary();
		int c = getCreditScore();
		boolean qualified = isUserQualified(s,c );
		notifyUser(qualified);
		 s1.close();
	}
	
	}
