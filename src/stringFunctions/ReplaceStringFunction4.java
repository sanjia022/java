package stringFunctions;



public class ReplaceStringFunction4 {
	
	
	// replace and replace All string functionss

	public static void main(String[] args) {
		
		
		// given string change the first letter with k
		//Scanner s1 = new Scanner(System.in);
		//System.out.println("Enter a string");
		//String value = s1.next();
		//value.replace(0,"k");
		
		
		// given string remove all the spaces
		
		String value1 = "sanjia amreen";
		System.out.println(value1.replace(" ", ""));
		
		// given string remove all the capital letters
		String value2 = "Sanjia amreen";
		System.out.println(value2.replaceAll("[A-Z]", ""));
		
		// given string , replace or remove all the lower case letters
		
		String value3 = "Sanjia amreen";
		System.out.println(value3.replaceAll("[a-z]", ""));
		//Given string, remove or replace all the numeric letter.String value2 = "Sanjia amreen";
		String value4 = "Sanjia amreen1";
		System.out.println(value4.replaceAll("[0-9]", ""));
		
		 
	}

}
