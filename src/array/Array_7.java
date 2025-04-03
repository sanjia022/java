package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_7 {
	
	//is given number from scanner class is present in int array

	public static void main(String[] args) {
		 int age [] = new int[3];
		 
		 System.out.println("Enter your array");
		 Scanner s1 = new Scanner(System.in);
		 
		 for(int i =0;i<age.length;i++) {
			 
		 age[i] = s1.nextInt();
		 }
		 System.out.println(Arrays.toString(age));
		 
		 System.out.println("Please enter random number");
		 
		 int number = s1.nextInt();
		 
		 for(int i=0;i<age.length;i++) {
		 if(number == age[i]) {
			 System.out.println("Yes");
		 }
		 else {
			 System.out.println("no");
		 }
		 s1.close();
		 }
	}

}
