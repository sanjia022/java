package polymorphism;

public class Banana extends Fruit{

	
	public Banana(){
		setCalories(70);
	}
	
	public void PeelTheSkin() {
		System.out.println("Banana's skin is peeled.");
	}
	
	public static void makeJuice() {
		System.out.println("Banana smoothie is my fav.");
	}
}
