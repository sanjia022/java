package stringFunctions;

public class PalindromePractice1 {
	
	
	
	public static void main(String[] args) {
		String name ="Sanjia";
		String name2 = "";
		for(int i = name.length()-1;i>=0;i--) {
		char name1 = name.charAt(i);
		name2 =name1+name2;
		
		
		
	
		}
		if(name2.equals(name)) {
			System.out.println("Palingdrome");
		}
		else {
			System.out.println("Not a palingdrome");
		}
	}
	}
