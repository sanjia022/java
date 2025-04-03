package array;

import java.util.Scanner;

//Check given number is in array or not
public class Practice_Array_5 {
	
	public static void arrayCheck() {
		
		System.out.println("Enter a number");
		Scanner s1 = new Scanner(System.in);
		int givenNumber = s1.nextInt();
		
		
		int num[] = new int[2];
		System.out.println("Enter a array");
		
		for(int i=0;i<num.length;i++) {
		num[i] =s1.nextInt();
		
		if(givenNumber == num[i]) {
			System.out.println("It is in the aaray");
		}
		else {
			System.out.println("It is not in the aaray");
		}
		
		}
		
		s1.close();
	}

	public static void main(String[] args) {
	
		arrayCheck();
		
	}

}
