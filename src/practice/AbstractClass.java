package practice;


interface substraction{
	
	void Addhjkh() ;
}



abstract class addition implements substraction {
	abstract void add();

	public static void add1() {
		System.out.println("sdlakj");
	}
}
public class AbstractClass extends addition{
	public static void add12() {
		System.out.println("s2222222dlakj");
	}
	
	public static void main(String[] args) {
		
	}

	@Override 
	void add() {
		System.out.println("abstract override");
	}

	@Override
	public void Addhjkh() {
		// TODO Auto-generated method stub
		
	}
}

