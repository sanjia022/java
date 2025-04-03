package array;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		int rollno[] = new int[3];

		rollno[0] = 45;
		rollno[1] = 40;
		rollno[2] = 409;
		// first way to print of an array
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);

		// Second way to print the array is:

		for (int i = 0; i <= 2; i++) {
			System.out.println(rollno[i]);
		}

		// Third way to print an array is using toStringArray function

		String roll = Arrays.toString(rollno);
		System.out.println((roll));
		// Array takes null value for only String
		String name[] = new String[3];

		name[0] = "Fayyaz";
		name[1] = "Sanjia";
		System.out.println(Arrays.toString(name));

		// But for int datatype it will store the default for int
		int rollno1[] = new int[5];

		rollno1[0] = 45;
		rollno1[1] = 40;
		rollno1[2] = 409;
		rollno1[3] = 40;

		System.out.println(Arrays.toString(rollno1));
		
		//The way to sort an array is showing below:
		int rollno2[] = new int[3];

		rollno2[0] = 45;
		rollno2[1] = 40;
		rollno2[2] = 409;
		Arrays.sort(rollno2);
		System.out.println(Arrays.toString(rollno2));
		
     //We can change the value of Array during the compile time but we cant change during the run time
	// To update a value of an array, we can do as local variable
	
	
	}
	
}
