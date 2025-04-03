package abstractpackage;

public class ShapeTester {

	public static void main(String[] args) {
		//Shape s1 = new Shape();// compilation error will send cause you can not initialize a abstract methode. 
		//so we need one of its sub classes.
		
		Shape s1 = new RectangleClass(5,7);
		s1.print();
		System.out.println(s1.calculatedArea());

	}

}
