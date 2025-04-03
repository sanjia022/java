package interfacePackage;

//An interface is similar to an abstract class, except that in an abstract class there can be some methods that are implemented.

//However, an interface consists of all abstract methods. Because all of the methods of an interface are abstract by nature, there's no need to declare the methods as abstract. It's just a given.

//The other way interfaces are different from abstract classes is that interfaces are implemented, not extended.

//Any class that implements an interface must implement all of its methods, or it must declare itself as an abstract class.


//*****Create product interface and Create a book That implements the product
interface Product{
	
	double getPrice();
	void setPrice(double price);
	
	String getColor();
	void setPrice(String color);
	
	String getName();
	void setName(String name);
	
	
	
	
	
	
}


public class ProductInterface {

}
