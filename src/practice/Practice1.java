package practice;


class Practice11{
	
	public void add1() {
		System.out.println("fgf");
	}
}
class Practice18 extends Practice11{
public static void sub() {
	System.out.println("inh");
}
}
public class Practice1 extends Practice18 {
	
	int a;
	
	public void add() {
		System.out.println("pif");
	}
public void add(int a) {
	System.out.println("fpoi");
	}

 
 
	public static void main(String[] args) {
		Practice1 p1 = new Practice1();
		p1.add();
		p1.add(0);
		sub();
	}

}
