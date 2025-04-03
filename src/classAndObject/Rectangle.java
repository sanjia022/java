package classAndObject;

public class Rectangle {
	
	private double length;  // FOR Object oriented langauge , any object class's variables 
	                        // or fields will be private. SO except this class , no other can 
	                         //access this variable
	private double width;
	// we can use getter and setter method to get and set the values for the length and width. 
	//Another is to create a constructor
	
	
	/*
	 * Encapsulation says to make the fields private and getter and setter methods public 
	 *to access those methods outside of the same package
	 * 
	 */
	
	/*
	 * protected means
	 * 
	 */
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	//to get and set the values for the length and width, we can create a constructor. 
	//Default constructor with no perameter
	//Constructor is use to initialize an object
	
	Rectangle()    // default constructor used when you do not the value of the fields or variables
	{
		length =0;
		width = 0;
	}
	
	Rectangle(double length, double width){
		this.length = length;  //can be set like this way
		setWidth(width);   // or can be set like this way
		
	}

	public double calculateArea() {
		double area = length*width;
		return area;
	}
	public double calculatePerimeter() {
		double perimeter = (2*length)+(2*width);
		return perimeter;
	}

}
