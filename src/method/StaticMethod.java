package method;

import java.util.Scanner;

public class StaticMethod {

	// Write a method that asks a user for their name, then greets them by name.
	public static void greetUser(String name) {

		System.out.println("Hello!" + name);

	}

	public static void main(String[] args) {

		System.out.println("Enter your name");
		Scanner s1 = new Scanner(System.in);
		String name = s1.next();
		greetUser(name);
		s1.close();

	}

}
