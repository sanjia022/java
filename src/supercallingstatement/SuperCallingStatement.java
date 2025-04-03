package supercallingstatement;

class Google{
	Google(int a){
		super();
		System.out.println("google constructor");
	}
}
class Amazon extends Google{
	Amazon(){
		super(12);
		//super(); super calling statement have to be in the first line of the constructor
		System.out.println("Amazon constructor");
	}
}

public class SuperCallingStatement extends Amazon{
	
	SuperCallingStatement(){
		
	}	

	public static void main(String[] args) {
		
	
	new SuperCallingStatement();
	}
	
}
