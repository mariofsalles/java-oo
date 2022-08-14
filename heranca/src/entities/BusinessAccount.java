package entities;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void loan(double value) {
		if (value <= loanLimit) {
			balance += value - 10.0;
		}
	}

	@Override
	public void withdraw(double value) {
		super.withdraw(value);
		balance -= 2.0;
	}
	
}
