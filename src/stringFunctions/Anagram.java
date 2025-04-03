package stringFunctions;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		//anagram: when two words contain same alphabets
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your first word");
		
		String word1 = s1.next();
		
		
		System.out.println("Enter your second word");
		
		String word2 = s1.next();
		
		
		if(word1.length() == word2.length()) {
			char[] w1 =word1.toCharArray();
			char[] w2 =word2.toCharArray();
			
			System.out.println(Arrays.toString(w1));
			System.out.println(Arrays.toString(w2));
			
			Arrays.sort(w1);
			System.out.println(w1);
			Arrays.sort(w2);
			System.out.println(w2);
			
			System.out.println(Arrays.toString(w1));
			System.out.println(Arrays.toString(w2));
			
			boolean answer = Arrays.equals(w1, w2);
			
			if(answer == true) {
				System.out.println("It is an anagram.");
			}
			else {
				System.out.println("This is not an anagram");
				System.out.println("This is not an anagram");
				System.out.println("This is not an anagram");
			}
		
			
		}
		else {
			System.out.println("This is not an anagram");
		}
		s1.close();

	}

}
