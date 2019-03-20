package ex_19;

public class Account {
	
	private int balance = 0;
	
	static final int MAX_BALANCE = 1000000;
	static final int MIM_BALANCE = 0;

	
	public void setBalance(int balance) {
		if(balance >= MIM_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}

	public int getBalance() {
		return this.balance;
	}
	
}
