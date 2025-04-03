package practice;

public class ConstructorOverloading {
	
	 ConstructorOverloading(){
		 this(34);
		System.out.println("Non para");
	}
	 ConstructorOverloading(int a){
		 System.out.println("para");
		}

	public static void main(String[] args) {
		new  ConstructorOverloading();
		
		
	}

}
