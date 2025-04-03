package accessSpecifier1;

import accessSpecifier.Class1;

public class Class3 extends Class1{

	public static void main(String[] args) {
		Class1.division();
		Class1.multiplication();
		// only the division and muliplication method have "public" and "protected" Access specifier. that why it is showing 
		//here if you
        // make relation with between the two classes or extends the class outside of the package
	
		
		/*
		 * Another way to call methods from different class from same package or outside of the package is to create
		 * an object of the sub class and with help of its ref variable we can call the methods
		 * Why sub class: to access methods of both sub and super class
		 */
		
		
		Class3 c1 = new Class3();
		c1.division();
		c1.multiplication();
	}

}
