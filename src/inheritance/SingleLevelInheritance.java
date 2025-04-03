package inheritance;

class Amazon{
	
	static void loginwithemail() {
		System.out.println("Login with email address");
	}
	
	void registration() {
		System.out.println("Registration");
	}
}

public class SingleLevelInheritance extends Amazon {

	static void loginwithPhone() {
		System.out.println("Login with phone number");
	}
	
	void logout() {
		System.out.println("logout");
	}

	public static void main(String[] args) {
		loginwithPhone();
		loginwithemail();
		SingleLevelInheritance s3= new SingleLevelInheritance();
		s3.logout();
		s3.registration();

	}

}
