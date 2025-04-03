package array;

import java.util.Arrays;
import java.util.Scanner;

//How to pass the value in array using scanner class.
public class Practice_array_2 {

	public static void main(String[] args) {
		int a1[] = new int[2];
		System.out.println("Enter your array values");
		Scanner s1 = new Scanner(System.in);
		
		for(int i=0;i<a1.length;i++) {
		a1[i] = s1.nextInt();


	}
		System.out.println(Arrays.toString(a1));
s1.close();
}
}