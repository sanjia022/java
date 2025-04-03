package methodoveriding;

public class SubClass extends SuperClass{
	
	public void add() {
		super.add();
		System.out.println("adding");
		
	}

	public static void main(String[] args) {
		
		SubClass s1 = new SubClass();
		s1.add();
	}

}
