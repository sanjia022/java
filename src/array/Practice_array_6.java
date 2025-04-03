package array;

import java.util.Scanner;

//Find out the average value of an array of int datatype whos size is 4. values are : 17,15,41,32
public class Practice_array_6 {

	public static void main(String[] args) {
		
		int num[] = new int[4];
		int num1 =0;
		
		System.out.println("Enter your array");
		Scanner s1 = new Scanner(System.in);
		
		for(int i=0;i<num.length; i++) {
		num[i] = s1.nextInt();
		num1 =num1+ num[i];
		
		
		}
		int avg = num1/4;
		System.out.println("The avg value of the array is:" + avg);
		s1.close();
		
		

	}

}
