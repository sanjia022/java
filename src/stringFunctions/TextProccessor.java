package stringFunctions;

/**
 * Splits a String into an array by tokenizing it. Counts words and prints them
 * 
 * @param text Full string to be split
 */
public class TextProccessor {
	//String text = "I love Testing";

	public static void countWords(String text) {
		String[] words = text.split(" ");
		int numberOfWords = words.length;
		
		String message = String.format("Your text contain %d words", numberOfWords);
		System.out.println(message);
		
		for(int i=0; i<numberOfWords; i++) {
			System.out.println(words[i]);
			
		}

	}

	public static void main(String[] args) {
		countWords("I Love Testing.");
	}

}
