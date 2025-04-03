package methodoverloading;

public class constructor {

	// Constructor can have any access specifier
	// it is also non static
	// it has no return type
	// name as class name
	// it can be parameterized and non parameterized

	public constructor() {
		System.out.println("I am a constructor");
	}

	//Constructor can be overloading with different in parameter
	
	public constructor (int a) {
		System.out.println("I am a constructor with a perameter");
	}
	
	public static void main(String[] args) {
		new constructor();
		new constructor(12);

		// There is two ways to create an object is:
		// ClassName c1 = new ClassName();
		// new ClassName();
	}

}
