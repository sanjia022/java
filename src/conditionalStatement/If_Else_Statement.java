package conditionalStatement;

import java.util.Scanner;

public class If_Else_Statement {
	/*
	IF Else Statement.
	All salespeople get a payment of $1000 a week.
	Salespeople who exceed 10 sales get an additional bonus of $250.
	*/
	
	static int salary = 1000;
	static int sales = 10;
	static int bonus = 250;
	
	public static void salesCalculator() {
		System.out.println("Please enter how many sales you have made this week");
		
		Scanner s1 = new Scanner(System.in);
		int salesEarnedPerWeek = s1.nextInt();
		
		if(salesEarnedPerWeek > sales) {
			bonus = bonus + salary;
			System.out.println("Your total salary for this week is " + bonus + '.');
		}else {
			System.out.println("Your total salary for this week is $1000.");
		}
		
		s1.close();
	}
	
	public static void main(String[] args) {
		salesCalculator();

	}


}
