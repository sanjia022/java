package thiscallingstatement;



public class ThisCallingStatement  {
	
	ThisCallingStatement(){
		this(90);
		System.out.println("I am a constructor with out any parameter");
	}
	ThisCallingStatement(int a){
		System.out.println("I am a constructor with int parameter");
	}
	
	

	public static void main(String[] args) {
	new ThisCallingStatement();
		

	}

}
