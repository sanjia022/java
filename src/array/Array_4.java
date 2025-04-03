package array;

import java.util.Arrays;

public class Array_4 {
// assign one arrays value to the another array
	public static void main(String[] args) {
int roll[] = new int[3];
		
		roll[0] = 23;
		roll[1] = 2;
		roll[2] = 3;
		
		int roll1[] = new int[3];
		
		for(int i=0; i<roll.length ; i++) {
			
		roll1[i]	= roll[i];
		
		
		}
		System.out.println(Arrays.toString(roll1));
		

	}

}
