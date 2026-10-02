package in.inter;

public class BankDemo {

	public static void main(String[] args) {

		// Calling static method of interface
		//Bank.bankInfo();

		Bank b;

		b = new AxisBank();

		b.moneyTransfer();
		b.checkBalance();

		b = new HdfcBank();

		b.moneyTransfer();
		b.checkBalance();
	}
}