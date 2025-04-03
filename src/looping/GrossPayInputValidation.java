package looping;

import java.util.Scanner;

/* WHILE LOOP:
* Each store employee makes $15 an hour. Write a program that allows the employee
* to enter the number of hours worked for the week. Do not allow overtime.
 * 
 */

public class GrossPayInputValidation {
	private int rate;
	private int maxHours;
	private double hoursWorked;
	
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getMaxHours() {
		return maxHours;
	}
	public void setMaxHours(int maxHours) {
		this.maxHours = maxHours;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHourWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public  void validateInput() {
		
		 System.out.println("How many hours did you work this week?");
	       Scanner scanner = new Scanner(System.in);
	       double hoursWorked = scanner.nextDouble();

	        //Validate input
	        while(hoursWorked > maxHours){
	            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
	           
	            hoursWorked = scanner.nextDouble();
	            //double gross = rate * hoursWorked;
	           // System.out.println("Gross pay: $" + gross);
	        }

	       scanner.close();
	        }
	
	public double calculateGrossPayment() {
		double payment = rate * hoursWorked;
		System.out.println("Gross Pay is $" + payment) ;
		return payment;
	}
	
}

