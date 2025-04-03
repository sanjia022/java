package stringFunctions;

public class WordPrinting {
	
	String name1;
	
	public void wordPrint1(String name) {
		this.name1= name;
		System.out.print(name1);
		
	}
	
	public static void wordPrint(String name) {
		for(int i=0; i<name.length(); i++) {
		char a1 = name.charAt(i);
		System.out.print(a1);
		
	} 
	}
	
	public static void wordPrint2(String name) {
		
		for(int i=name.length()-1; i>=0 ;i--) {
		char a1 = name.charAt(i);
		
	System.out.println(a1);
	}
		
	}
	public static void main(String[] args) {
		wordPrint("Sanjia");
		wordPrint2("Sanjia");
		WordPrinting a2 = new WordPrinting();
		a2.wordPrint1("Amreen");

	}

}
