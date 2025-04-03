package classAndObject;

import java.util.Scanner;

public class HomeAndAreaCalculatorRedo {
	Scanner s1 = new Scanner(System.in);

	public Rectangle getRoom() {

		System.out.println("Enter the length of your room");
		double lenght = s1.nextDouble();
		System.out.println("Enter the width of your room");
		double width = s1.nextDouble();

		Rectangle room = new Rectangle(lenght, width);
		return room;

		// return words should be bottom of the method
		// Rectangle room = new Rectangle(lenght,width);// can be written like this
		// can be written like this

		// return new Rectangle(lenght, width);

	}

	public double calculateTotalArea(Rectangle kitchen, Rectangle bathroom) {
		double area = kitchen.calculateArea() + bathroom.calculateArea();
		// here kitchen and bathroom are two object in method perameter. So we can 
		//use these two object to get in rectangle class and use its methods

		return area;

	}

	public static void main(String[] args) {
		HomeAndAreaCalculatorRedo h1 = new HomeAndAreaCalculatorRedo();

		Rectangle kitchen = h1.getRoom();
		Rectangle bathroom = h1.getRoom();
		double totalArea = h1.calculateTotalArea(kitchen, bathroom);
		System.out.println("The area of kitchen and bathroom is: " + totalArea);
		h1.s1.close();
	}
}
