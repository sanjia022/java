package switchcase;

import java.util.Scanner;

public class SwitchCase3 {
	
	public static void roomNo() {
		Scanner s1 = new Scanner(System.in);
		
		
		System.out.println("If you are in first grade, enter 1");
		System.out.println("If you are not in first grade, enter 2");
		int answer = s1.nextInt();
		
		
		// remember switch case can not take boolean value. it can take int and string
		switch(answer)
		{
		case(1):System.out.println("You are in room number 203");
			break;
		case(2):System.out.println("You are in room number 304");
			break;
		default: System.out.println("Please enter the correct answer again");
		s1.close();
		}
		
	}

	public static void main(String[] args) {
		
		roomNo();
		
	}

}
