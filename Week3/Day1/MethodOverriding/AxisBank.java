package assignment11;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		System.out.println("My Deposited amount on my Axis Bank is 60000");
	}
	public static void main(String[] args) {
		System.out.println("********Method Overriding********");
		System.out.println("********Bank Info********");
		BankInfo bank = new BankInfo();
		bank.deposit();
		bank.fixed();
		bank.saving();
		System.out.println("********Axis Bank********");
		AxisBank axis = new AxisBank();
		axis.deposit();
	}

}
