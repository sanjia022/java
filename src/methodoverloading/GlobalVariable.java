package methodoverloading;

public class GlobalVariable {
	 static int a = 23;
	  int b = 45;
	 

	public static void main(String[] args) {
		GlobalVariable g1 = new GlobalVariable();
		g1.b = 89;
		
		System.out.println(a+g1.b);
		
		//the way to use global variable is ref variable.variable(g1.b)
		System.out.println(g1.b);
		
	
		

	}

}
