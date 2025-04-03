package stringFunctions;

import java.util.Scanner;

/**
* Prints a String in reverse order
* @param text String to reverse
*/
public class ReverseString {
	
	
	public static void reverse(String input) {
		String output =" ";
		for(int i =input.length()-1; i>=0; i--) {
			
			char a1 = input.charAt(i);
			output = output + a1;
		}
	System.out.println(output);
	}

	public static void main(String[] args) {
		System.out.println("Please enter a text");
		Scanner s1 = new Scanner(System.in);
		String input  = s1.nextLine();// Use nextLine() to read the whole line
		
		 reverse(input);
		
		 
		 reverse("Where are you");// This will still reverse the hardcoded string

		 s1.close();
	}

}
