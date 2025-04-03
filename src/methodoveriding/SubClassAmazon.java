package methodoveriding;

public class SubClassAmazon extends SuperclassAmazon {
	
	 void add(int a) {
		System.out.println("Add method");
		super.add(8);
	}
	
	public static void main(String[] args) {
		SubClassAmazon a1 = new SubClassAmazon();
		a1.add(78);
	}
}
