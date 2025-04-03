package interfacePackage;

public class BookClass implements Product{
	
	double price;
	String name;
	String color;
	String author;
	int isbnNumber;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void setPrice(String color) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
	
	

}
