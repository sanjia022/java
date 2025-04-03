package methodoverloading;

public class MethodOverloading {
	
	public static void add() {
		System.out.println("add");
	}
    public static void add(int a) {
		System.out.println("add with int one value");
	}
    
    public static void add(int a, int b) {
		System.out.println("add with two int value");
	}
    
    public void add (int d,int c, int f ) {
    	System.out.println("add with three int value");
	}

	public static void main(String[] args) {
		add();
		add(90);
		add(23,56);
		MethodOverloading a1 = new MethodOverloading();
		a1.add(7, 9, 6);

	}

}
