package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramOverride {

	public static void main(String[] args) {

//		Account acc1 = new Account(1001, "Miguel", 1000.00);
//		acc1.withdraw(200.0);		
//		System.out.println(acc1.getBalance());

		Account sacc1 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		sacc1.withdraw(200.0);
		System.out.println(sacc1.getBalance());
		
		Account bacc1 = new BusinessAccount(1003, "Maria", 1000.00, 5000.00);
		bacc1.withdraw(200.0);
		System.out.println(bacc1.getBalance());
	}

}
