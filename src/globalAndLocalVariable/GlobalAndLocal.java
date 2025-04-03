package globalAndLocalVariable;

public class GlobalAndLocal {
	
	int age;
	String name;
	double salary;
	
	void employeeDetail(int age,double salary, String name) {
		System.out.println("Age is: " + age);
		System.out.println("Salary is: " + salary);
		System.out.println("Name is: " + name);
		this.name = name;
	}

	public static void main(String[] args) {
		GlobalAndLocal g1 = new GlobalAndLocal();
		g1.employeeDetail(34, 4.8900, "Sanjia");
		System.out.println(g1.name);
	    

	}

}
