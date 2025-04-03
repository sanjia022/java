package polymorphism;

public class Apple extends Fruit{
	
	public Apple() {
		setCalories(789);
	}
	
	public static void removeSeed() {
		System.out.println("Apple seed is removed.");
	}
	
	public static void makeJuice() {
		System.out.println("Apple juice is my fav.");
	}

}
