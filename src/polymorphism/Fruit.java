package polymorphism;

public class Fruit {

	private int calories;

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public static void makeJuice() {
		System.out.println("Juice is made.");
	}

}
