package interfacePackage;




/*create an abstract class called Animal, which declares an abstract method called makeSound(), //
and implements a non-abstract method called eat().
Then create a Pig class and a Duck class that both extend the Animal class.

Finally, create a Farm class to test these implementations. */

public class FarmClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Pig();
		a1.eat();
		a1.makeSound();

	}

}
