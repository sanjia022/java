package array;

import java.util.Arrays;

public class Practice_array_1 {
	// Check if two arrays are equal or not. 
	public static void main(String[] args) {
		
		
		int data1[] = new int[3];
		
		data1[0] = 23;
		data1[1] = 34;
		data1[2] = 56;
		int data2[] = new int[3];
		data2[0] = 23;
		data2[1] = 23;
		data2[2] = 23;
		
		
		System.out.println(Arrays.equals(data1, data2));
	
		

	}

}
