package switchcase;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Please enter 1 for chrome browser");
		System.out.println("Please enter 2 for Edge browser");
		Scanner s1 = new Scanner(System.in);
		int value = s1.nextInt();
		
		switch(value) {
		case  (1) :System.out.println("chrome Browser");
		      break;
		case  (2) :System.out.println("Edge Browser");
	           break;
	           default: System.out.println("Please enter correct number for correct browser");
		
		}
		
        s1.close();
	}

}
