package array;

import java.util.Arrays;
import java.util.Scanner;

// Check if two arrays are equal or not. Arrays.equal Returns true if the two specified arrays of ints are equal to one another
public class Array_1 {

	public static void main(String[] args) {
	
		int [] rollNo = new int [3];
		 rollNo[0] = 23;
		 rollNo[1] = 21;
		 rollNo[2] = 0;
		 
		 int [] rollNo1 = new int [3];
		 rollNo1[0] = 23;
		 rollNo1[1] = 21;
		 rollNo1[2] = 2;
		
		 //Arrays.equal can check between two array and give you the result
		 
		boolean answer = Arrays.equals(rollNo, rollNo1);
		System.out.println(answer);
		
		double salary[] = new double[2];// declaration of an array
		
		System.out.println("Please enter your value");
		Scanner s1 = new Scanner(System.in);
		
		
		for(int i=0;i<salary.length;i++) {
		salary[i] =s1.nextDouble();
		}
		System.out.println(Arrays.toString(salary));
	
		
double salary1[] = new double[2];// declaration of an array
System.out.println("Please enter your value");
	
for(int i=0;i<salary1.length;i++) {
	salary1[i] =s1.nextDouble();
	}
	System.out.println(Arrays.toString(salary1));
		boolean answer1 = Arrays.equals(salary, salary1);
		System.out.println(answer1);
		
		s1.close();
		}

	}


