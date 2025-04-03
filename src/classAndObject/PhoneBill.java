package classAndObject;

public class PhoneBill {

	private int id;
	private double baseCost;
	private int allottedMinutes;
	private int minuteUsed;

	PhoneBill() {

		int id = 0;
		double baseCost = 79.99;
		int allottedMinutes = 800;
		int minuteUsed = 800;
	}

	PhoneBill(int id) {
		this.id = id;
		double baseCost = 79.99;
		int allottedMinutes = 800;
		int minuteUsed = 800;

	}
	PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
		this.id = id;
		this.baseCost = baseCost;
		this.allottedMinutes = allottedMinutes;
		this.minuteUsed = minutesUsed;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}

	public int getAllottedMinutes() {
		return allottedMinutes;
	}

	public void setAllottedMinutes(int allottedMinutes) {
		this.allottedMinutes = allottedMinutes;
	}

	public int getMinuteUsed() {
		return minuteUsed;
	}

	public void setMinuteUsed(int minuteUsed) {
		this.minuteUsed = minuteUsed;
	}

	

	public double calculateOverage() {
		if (minuteUsed <= allottedMinutes) {
			return 0;
		} else {
			double overageRate = .25;
			double overageMinutes = minuteUsed - allottedMinutes;
			double overageMinutesCost = overageRate * overageMinutes;
			//System.out.println("Overage minute is:" + overageMinutes);

			return overageMinutesCost;
		}

	}

	public double calculateTax() {
		double taxRate = .15;
		double tax = taxRate * (baseCost + calculateOverage());
		return tax;
	}

	public double calculateTotal() {
		double total = baseCost + calculateTax() + calculateOverage();
		return total;
	}

	public void printItemizedBill() {
		System.out.println("ID: " + id);
		System.out.println("Base Rate: $" + baseCost);
		System.out.println("Overage Fee: $" + String.format("%.2f", calculateOverage()));
		System.out.println("Tax: $" + String.format("%.2f", calculateTax()));
		System.out.println("Total: $" + String.format("%.2f", calculateTotal()));
	}
}