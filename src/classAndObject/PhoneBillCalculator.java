package classAndObject;

public class PhoneBillCalculator {

	public static void main(String[] args) {
		
		PhoneBill p1 = new PhoneBill(89678,79.99,800,900);
		//p1.setMinuteUsed(1000);
		
		p1.printItemizedBill();

	}

}
