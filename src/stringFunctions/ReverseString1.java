package stringFunctions;

public class ReverseString1 {
	
	 String value = "world";
	
	public void reverseString() {
		
		String output = " ";
		
		
		for(int i =value.length()-1; i>=0; i--) {
			char a2= value.charAt(i);
			output = output + a2;
		}
		System.out.println(output);
		}
				
			
	public static void main(String[] args) {
		ReverseString1 s2 = new ReverseString1();
		s2.reverseString();
		
	}

}
