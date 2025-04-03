package methodoverloading;

import java.util.Scanner;

public class MathClass {
  final static double pi = Math.PI;
	public static void main(String[] args) {
		int add =Math.addExact(12,67);
		System.out.println(add);
		System.out.println(Math.addExact(87897798798L, 57657686889L));
		System.out.println(Math.PI);
		
		System.out.println("Enter the value of your radius");
		Scanner s1 =new Scanner (System.in);
		int radius = s1.nextInt();
		double areaOfTheCircle = pi *Math.sqrt(radius);
		System.out.println("The area of the circle is:"  + areaOfTheCircle);
		s1.close();

	}

}
