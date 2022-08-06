package entities;

public class Account {

	private int accountNumber;
	private String holder;
	private double balance;
	
	public Account(int accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public Account(int accountNumber, String holder, double initial) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initial);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
		
	public void deposit(double money) {
		balance += money;
	}
	
	public void withdraw(double money) {
		balance -= money + 5;
	}

	public String toString() {
		return "Account " + accountNumber + ", "
				+ "Holder: " + holder + ", "
				+ "Balance: $" + String.format("%.2f",balance);
	}

}
