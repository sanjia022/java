package stringFunctions;

public class Palingdrome2 {
	
	public void word(String word) {
		String output = "";
		
		for(int i=word.length()-1; i>=0;i--) {
		char a1 = word.charAt(i);
		output = output + a1;
		}
		if(output.equals(word)) {
			
		System.out.println("Is is a palingdrome");
		}
		else {
			System.out.println("Is is not a palingdrome");
		}
	}
		
	
	public static void main(String[] args) {
		Palingdrome2 w1 = new Palingdrome2();
		w1.word("mom");
			
		

	}

}
