package stringFunctions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramPractice2 {
	
	public static void checkAnalog() {
	
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter your first word");
	String word1 = s1.next();
	
	System.out.println("Enter your second word");
	String word2 = s1.next();
	
	if(word1.length() == word2.length()) {
		
		char[] a1 = word1.toCharArray();
		char[] a2 = word2.toCharArray();
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
		Arrays.sort(a2);
		Arrays.sort(a1);
		
		if(Arrays.equals(a1, a2)) {
		System.out.println("it is an anagram");
		}
		else {
			System.out.println("It is not a Analog");
		}
	}
	else {
		System.out.println("It is not a Analog");
	}
	
	
    s1.close();
	}
	
	
	public static void main(String[] args) {

		checkAnalog();
	}

}
