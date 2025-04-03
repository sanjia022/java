package polymorphism;

public class Market {

	public static void main(String[] args) {
		Apple fuji = new Apple();
		fuji.removeSeed();
		fuji.makeJuice();
		sqeeze(fuji);
		
		Banana banana = new Banana();
		banana.PeelTheSkin();
		banana.makeJuice();
		
		Fruit gala = new Apple();
		gala.setCalories(34);
		gala.makeJuice();
		
		gala = new Banana();
		gala.setCalories(34);
		gala.makeJuice();
	
		sqeeze(gala);
		

	}
	public static void sqeeze(Fruit fruit) {
		if(fruit instanceof Apple) {
			System.out.println("I am an apple");
			
		}else if(fruit instanceof Banana){
			System.out.println("I am banana");
		}
	}

}
