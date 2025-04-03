package supercallingstatement;

 class A{
	A(int a ){
		System.out.println("Amazon constructor");
	}
	
}
class G extends A{
	G(){
		super(78);
		
		System.out.println("Google constructor");
	}
}

public class SuperCallingStatement1 extends G {
	


	

	

	public static void main(String[] args) {
		new SuperCallingStatement1 ();
	}

}
