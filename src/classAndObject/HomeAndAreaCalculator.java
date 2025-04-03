package classAndObject;

public class HomeAndAreaCalculator extends Rectangle{

	public static void main(String[] args) {
		/************
		 * Room 1
		 * 
		*********** */
		
		//Create instance of the rectangle class with rectangle constructor two perameter
        Rectangle room1 = new Rectangle(75,98);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("Area of room1 is:" + areaOfRoom1);
        /******************
         * Room2
         ***************/
        
      //Create an instance of the rectangle class with rectangle constructor no perameter
        Rectangle room2 = new Rectangle();
        room2.setLength(98);
        room2.setWidth(34);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("Area of room1 is:" + areaOfRoom2);
        
        //Area of both room 
        
        double area = areaOfRoom2 + areaOfRoom1;
        System.out.println("Area of the both room is: " + area);
	}

}
