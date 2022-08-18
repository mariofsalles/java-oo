package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ProgramEmployee {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d data:\n", i + 1);
			System.out.print("Outsourced (y/n)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			switch (option) {
			case 'n':
				Employee employee = new Employee(name, hours, valuePerHour);
				employees.add(employee);
				System.out.println();
				break;
			case 'y':
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee outsourcing = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(outsourcing);
				System.out.println();
				break;
			default:
				System.out.println("Invalid option, program exit");
				break;
			}
		}

		System.out.println("\nPAYMENTS:");
		for (Employee emp : employees) {
			System.out.printf("%s - %.2f%n", emp.getName(), emp.payment());
		}

		sc.close();

	}
}
