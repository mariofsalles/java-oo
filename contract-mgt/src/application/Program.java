package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();

		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();

		Contract contract = new Contract(number, date, totalValue);

		ContractService cs = new ContractService(new PaypalService());
		cs.processContract(contract, installments);

		System.out.println("Installments: ");
		for (Installment inst : contract.getInstallments()) {
			System.out.printf("%s - %.2f\n", sdf.format(inst.getDueDate()), inst.getAmount());
		}

		sc.close();
	}

}
