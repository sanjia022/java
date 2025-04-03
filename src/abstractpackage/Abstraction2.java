package abstractpackage;

abstract class Super_Sub_Class{
	abstract public void add();
	abstract public void subs();
	 static void multipy() {
		
	 }
	
}
 class Super_Class extends Super_Sub_Class {
	 
	 public void add1() {
		 System.out.println("add1");
	 }

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subs() {
		// TODO Auto-generated method stub
		
	}
 }

public class Abstraction2 extends Super_Class {
	
	public void sub1 () {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
