
package array;

import java.util.Scanner;

public class Array_5 {

	// check a given number is equal to the number

	public static void main(String[] args) {
		int roll[] = new int[3];

		roll[0] = 23;
		roll[1] = 2;
		roll[2] = 3;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = s1.nextInt();
		
		for(int i= 0; i< roll.length; i++) {
			if(number == roll[i]) {
			System.out.println("Given number is match with the array");
			}
			else {
				System.out.println("Given number is not the part of the array");
			}
		}
		
		
		s1.close();

	}

}
