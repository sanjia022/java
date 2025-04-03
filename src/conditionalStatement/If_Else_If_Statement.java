package conditionalStatement;

import java.util.Scanner;

public class If_Else_If_Statement {
/*
 * If else if statement use when they is more than two possible paths
 * Display the letter grade for a student based on their test score.
 */
	
	public  void testScore() {
		 
		System.out.println("Please enter your test score");
		Scanner s1 = new Scanner(System.in);
		double score = s1.nextDouble();
		
		if (score> 90) {
			System.out.println("Your grade is A.");
		}
		     else if(score> 80 && score <90 ){
			         System.out.println("Your score is B.");
		      }
		     else if(score>70 && score <80 ){
		         System.out.println("Your score is C.");
	      }

		else {
			System.out.println("Sorry! you failed the test.");
		}
		
		s1.close();
	}
	public static void main(String[] args) {
		If_Else_If_Statement s2 = new If_Else_If_Statement();
		s2.testScore();

	}

}
