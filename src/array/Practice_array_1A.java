package array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_array_1A {

	public static void main(String[] args) {
		
		String name[] = new String[2];
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your array's value");
		
		for(int i=0; i<name.length; i++) {
		name[i]  = s1.next();
		}
		System.out.println(Arrays.toString(name));
		
		
		String name1[] = new String[2];
		System.out.println("Enter your second array's value");
		
		for(int i=0; i<name1.length;i++) {
		name1[i] = s1.next();
		
		
		}
		System.out.println(Arrays.toString(name1));
		
		if(Arrays.equals(name, name1)) {
			System.out.println("Both arrays are equal");
		}
		else {
			System.out.println("Both arrays are not equal");
		}
        s1.close();
	}

}
