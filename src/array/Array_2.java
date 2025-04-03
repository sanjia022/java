package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2 {

	// How to pass the value in array using scanner class.

	public static void main(String[] args) {

		String name[] = new String[3];
		System.out.println("Enter the name");
		Scanner s1 = new Scanner (System.in);
		
		for(int i=0; i<name.length;i++) {
        name[i] = s1.next();		
		}
		System.out.println(Arrays.toString(name));
	
		
		
		int roll[] = new int[2];
		System.out.println("Enter the their age");
		for(int i = 0; i< roll.length; i++) {
		roll[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(roll));
		
		
		
		System.out.println("Enter your salary");
		double salary [] = new double[2];
		for(int i=0;i<salary.length;i++) {
		salary[i]=s1.nextDouble() ;
				
		}
		System.out.println(Arrays.toString(salary));
		
				s1.close();
	}
	
}
