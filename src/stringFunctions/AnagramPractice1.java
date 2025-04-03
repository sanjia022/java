package stringFunctions;

import java.util.Arrays;

public class AnagramPractice1 {
	
	
	public static void main(String[] args) {
		
		String name = "sanjia";
		String name1 = "fayyaz";
		
		
		char[] name2 = name.toCharArray();
		System.out.println(Arrays.toString(name2));
		
		char[] name3 = name1.toCharArray();
		System.out.println(Arrays.toString(name3));
		
		
		
		if(name2.length == name3.length ) {
			
			Arrays.sort(name2);
			System.out.println(name2);
			//System.out.println(Arrays.toString(name2));
			Arrays.sort(name3);
			System.out.println(name3);
			//System.out.println(Arrays.toString(name3));
			
			if(Arrays.equals(name2, name3)){
				System.out.println("It is an anagram");
			}
			else {
				System.out.println("It is not an anagram");
			}
		}
		

	}

}
