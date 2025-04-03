package array;

import java.util.Arrays;
import java.util.Scanner;

// Assign one array value to the another array
public class Practice_array_4 {

	static Scanner s1 = new Scanner(System.in);

	public void array1() {
		int num[] = new int[2];

		System.out.println("Enter your array's value");

		for (int i = 0; i < num.length; i++) {

			num[i] = s1.nextInt();

		}
		
int num2[] = new int[2];
		
		for(int i=0; i<num2.length;i++) {
		num2[i]	= num[i];
		}
		System.out.println(Arrays.toString(num2));
	}


	

	public static void main(String[] args) {
Practice_array_4 pi = new Practice_array_4();
		
		pi.array1();
		
		
		s1.close();
	}

}
