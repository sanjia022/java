package conditionalStatement;

import java.util.Scanner;

/*
 * Nested if statements are paths inside of paths.If a certain situation occurs, 
 * check for the next situation.
 * 
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 * 
 */
public class Nested_If_Statement {

	double minSalary = 30000;
	double workMinYear = 2;

	public void loanCalculator() {
		System.out.println("Please enter your salary");
		Scanner s1 = new Scanner(System.in);
		double salary = s1.nextDouble();

		System.out.println("Please enter how many years you have worked in this company:");
		double year = s1.nextDouble();
		if (salary >= minSalary) {

			if (year >= workMinYear) {
				System.out.println("You are qualified for the loan.");
			}
		} else {
			System.out.println("Sorry! you are not qualified for the loan.");

		}
		
		/*
		 * Another way to solve this problem is to use logical operator
		 * if (salary >= minSalary && (year >= workMinYear ) {
                 System.out.println("You are qualified for the loan.");
			}
		} else {
			System.out.println("Sorry! you are not qualified for the loan.");

		}
		 * 
		 */
		s1.close();
	}

	public static void main(String[] args) {
		Nested_If_Statement n1 = new Nested_If_Statement();
		n1.loanCalculator();
	}

}
