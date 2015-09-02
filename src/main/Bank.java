package main;

public class Bank {
	
	private static final int DEFAULT_BANK_VALUE = 10000;
	
	private int bankAmt;
	
	public Bank() {
		bankAmt = DEFAULT_BANK_VALUE;
	}
	
	public int getBankAmt () {
		return bankAmt;
	}
	
	public void reduceBankAmt (int m) {
		bankAmt = bankAmt - m;
	}
	
	public void payBank (int m) {
		bankAmt = bankAmt + m;
	}
	
}
