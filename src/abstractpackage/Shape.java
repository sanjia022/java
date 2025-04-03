package abstractpackage;

public abstract class Shape {
	
	abstract double calculatedArea(); 
	
	
	/// abstract class and methods can be any access specifier
	// abstract class can have abstract method or concrete method.Here print method
	// is concrete method
	// and calculated Area is abstract method

	void print() {
		System.out.println("I am a shape.");
	}

}
