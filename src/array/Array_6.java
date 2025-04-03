package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_6 {
//Find out the average value of an array of int datatype whos size is 4. values are : 17,15,41,32
	public static void main(String[] args) {
		
		int number[] = new int[4];
		int sum= 0;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the 4 values from the question:");
		
		for(int i =0; i<number.length; i++) {
		number[i] = s1.nextInt();
		}
		
		String numbers = Arrays.toString(number);
		System.out.println(numbers);
		
		for(int i =0; i<number.length; i++) {
			sum = sum + number[i];
		}
		
		int avg = sum/4;
		System.out.println("The average is:" + avg);
		s1.close();
	}

}
