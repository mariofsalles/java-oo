package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit (y/n)?");
		char cond = sc.nextLine().charAt(0);

		Account ac = null;

		while (cond != 'y') {
			if (cond == 'n') {
				break;
			} else {
				System.out.print("Invalid option! Try again.");
				cond = sc.nextLine().charAt(0);
			}
		}

		switch (cond) {
		case 'y':
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			ac = new Account(number, holder, balance);			
			break;
		case 'n':
			ac = new Account(number, holder);			
			break;
		}


		System.out.println("\nAccount Data:");
		System.out.println(ac);

		System.out.print("\nEnter with deposit value: ");
		ac.deposit(sc.nextDouble());
		System.out.println("Updated account data:\n" + ac);
		
		System.out.print("\nEnter a withdraw value: ");
		ac.withdraw(sc.nextDouble());
		System.out.println("Updated account data:\n" + ac);

		sc.close();
	}

}
