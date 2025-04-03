package accessSpecifier;

public class Class2 {

	public static void main(String[] args) {
		Class1.substraction();// One way to call the static method from different class but from same package
		
		Class1 c1 = new Class1();
		c1.division();
		

	}

}
