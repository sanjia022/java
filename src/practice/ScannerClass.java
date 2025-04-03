package practice;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String name = s1.next();

		switch (name) {
		case ("Shakira"):
			System.out.println("Room no 1");
			break;
		case ("sanjia"):
			System.out.println("Room no 2");
			break;
		default:
			System.out.println("Please enter correct input");
			s1.close();
		}

	}
}
