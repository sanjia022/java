package looping;

public class GrossPayInputValidationCalculator {

	public static void main(String[] args) {
		GrossPayInputValidation g1 = new GrossPayInputValidation();
		g1.setMaxHours(40);
		g1.setRate(15);
		g1.validateInput();
		g1.setHourWorked(40);
		g1.calculateGrossPayment();

	}

}
