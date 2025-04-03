package thiscallingstatement;

public class ThisCallingStatement1 {
	
	ThisCallingStatement1(){
		System.out.println("I am constructor with no parameter");
	}
	

	ThisCallingStatement1(int a){
		this();
		System.out.println("I am constructor with int parameter");
	}

	public static void main(String[] args) {
		
		
		new ThisCallingStatement1(78);
		

	}

}
