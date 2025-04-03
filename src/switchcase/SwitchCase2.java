package switchcase;

import java.util.Scanner;

public class SwitchCase2 {
	/*
	 * SWITCH
	 * Have a user enter their letter grade, and using a switch statement,
	 * print out a message letting them know how they did.
	 */
	public static void main(String[] args) {
		System.out.println("Please enter your grade");
		Scanner s1 = new Scanner(System.in);
		String grade = s1.next();
		
		switch(grade) {
		case("A"): System.out.println("Congrats! you did excellent on your test");
		           break;
		case("B"): System.out.println("Great! you did well on your test");
        break;
		case("F"): System.out.println("On no! you did not do well on your test. Better luck next time");
        break;
        default : System.out.println("Please enter correct letter grade");
		}
		s1.close();

	}

}
