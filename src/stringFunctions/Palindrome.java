package stringFunctions;

public class Palindrome {
	// A palindrome is a word, phrase, number, or other sequence of characters that reads the
	//same backward as forward, disregarding punctuation, capitalization, and spacing.
	
	
	public void palindrome(String input) {
		String output = "";
		for(int i=input.length()-1; i>=0; i--) {
			char a1 = input.charAt(i);
			output = output + a1;
			
		
			
		}
		System.out.println(output);
		if(output.equals(input)) {
			System.out.println("It is a palindrome.");
			
		}
		else {
			System.out.println("It is not a palindrome." );
			
		}
		
	}

	public static void main(String[] args) {
		Palindrome p1 = new Palindrome();
		p1.palindrome("world");
		
		

	}

}
