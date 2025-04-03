package inheritance;

public class Google extends Flipkart {
	
	static void login() {
		System.out.println("Login");
	}
	
	void registration() {
		System.out.println("Registration");
	}
	public static void main(String[] args) {
		login();
		loginwithemail();
		Google g1 = new Google();
		g1.registration();
		g1.registration1();
	}

}
