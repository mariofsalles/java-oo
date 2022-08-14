package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramWorker {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter departament's name: ");
		String department = sc.nextLine();

		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Level: ");
		String level = sc.nextLine();

		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Departament(department));
		sc.nextLine();

		System.out.print("How many contracts to this worker? ");
		Integer n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter contract #%d data:\n", i + 1);
			sc.nextLine();
			System.out.print("Date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());

			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();

			HourContract contract = new HourContract(date, valuePerHour, hours);
			worker.addContract(contract);
		}
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		double income = worker.income(year, month);

		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartment().getName());
		System.out.printf("Income for %s: %.2f", monthAndYear, income);

		sc.close();

	}

}
