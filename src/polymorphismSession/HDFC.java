package polymorphismSession;

public class HDFC extends Bank {
	@Override
	public int homeLoan() {
		return 9;
	}

	public int cardCharges(boolean flag) {
		return 25;
	}

	public static void main(String[] args) {
		HDFC b = new HDFC();
		Bank b1 = new HDFC();

		System.out.println(b.homeLoan());
		System.out.println(b.carLoan());
		System.out.println(b.cardCharges());
		System.out.println(b1.cardCharges());

	}

	/*
	 * public static void main(String[] args, String[] args2) {
	 * 
	 * }
	 */

}
