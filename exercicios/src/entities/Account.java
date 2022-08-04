package entities;

public class Account {

	private int accountNumber;
	private String holder;
	private float balance;

	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}

	public Account(int accountNumber, String holder, float balance) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String toString() {
		return "Account " + accountNumber + ", Holder: " + holder + ", Balance: " + balance;
	}

}
