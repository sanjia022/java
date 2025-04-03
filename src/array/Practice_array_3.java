package array;

import java.util.Arrays;

public class Practice_array_3 {
	

	public static void main(String[] args) {
		
		
		int age[] = new int[2];
		age[0] = 23;
		age[1] = 34;
		
		
		int ageReverse[] = new int[2];
		
		for(int i = 0,k=age.length-1; i<age.length; i++,k--) {
	    ageReverse[k] =  age[i];
		

	}
		System.out.println(Arrays.toString(ageReverse));

}
}