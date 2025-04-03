package practice;

class Method1{
	Method1(int h){
		System.out.println("Method1");
	}
	public void add() {
		System.out.println("khj");
	}
}

public class MethodOverriding extends Method1{
	MethodOverriding(){
		super(8);
		System.out.println(" non para");
	}
   MethodOverriding(int a){
	   this();
		System.out.println("para");
	}
	
public void add() {
	super.add();
		System.out.println("jlj");
	}

	public static void main(String[] args) {
		MethodOverriding m1 = new MethodOverriding(89);
		m1.add();
		
	}

}
