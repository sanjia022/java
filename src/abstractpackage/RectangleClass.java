package abstractpackage;

public class RectangleClass extends Shape {
      
	double length;
	double width;
	
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
	public RectangleClass (double length, double width) {
		setLength(length);
		setWidth(width);
	}
	@Override
	public double calculatedArea() {
		return length * width;
		// TODO Auto-generated method stub
		
	}

}
