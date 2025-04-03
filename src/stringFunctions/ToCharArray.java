package stringFunctions;

import java.util.Arrays;

public class ToCharArray {

	public static void main(String[] args) {
		int count_of_alphabet = 0;
		int count_of_space = 0;
		int count_of_number= 0;
		String input = "Zaina is #1 student in her class.";
		
		char[] input1 = input.toCharArray();
		System.out.println(Arrays.toString(input1));
		
	
		// toChar Array method is important to find out how mamny special character involve, find out of space
	
		
		//Question: Find out how many alphabet is present in a given string
	for(int i =0; i<input.length();i++) {
		Boolean answer = Character.isAlphabetic(input1[i]);
		System.out.println(answer);
		if (answer == true) {
			count_of_alphabet ++;
			
		}
	
	}
	System.out.println("the count of alphabets are : " + count_of_alphabet);
		
		// Question : Find of space is present or not  
	for(int i =0; i<input.length();i++) {
		Boolean answer = Character.isSpaceChar(input1[i]);
		System.out.println(answer);
		
		if(answer == true) {
			count_of_space++;
		}
		
		
				
	}
	System.out.println("Count of the space is:" + count_of_space);
		//Question : Find of how many numeric is present in a given text 
	for(int i =0; i<input.length();i++) {
		Boolean answer = Character.isDigit(input1[i]);
		System.out.println(answer);
		if(answer == true) {
			count_of_number++;
		}
		
				
	}
	System.out.println("The count of number is:" + count_of_number);
	}

	}


