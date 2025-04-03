package abstractpackage;

abstract class Amazon// abstract class
{
	
	abstract public void login() ;// abstract method
	abstract void registration();// abstract methode
}

public class Abstraction1 extends Amazon  //concreate class
{
	public void logout() // concrete method
	{
		System.out.println("Contrete method");
	}

	public static void main(String[] args) {
		 

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void registration() {
		// TODO Auto-generated method stub
		
	}

}
