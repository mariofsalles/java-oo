package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<Employee>();

		System.out.print("How many employees wil be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("\nEmployee #%d\n", i + 1);
			Employee employee = new Employee();
			System.out.print("Id: ");
			employee.setId(sc.nextInt());
			while (employees.stream().filter(x -> x.getId() == employee.getId()).findFirst().orElse(null) != null) {
				System.err.println("\nId already registered, try again.");
				System.out.print("Id: ");
				employee.setId(sc.nextInt());				
			}
			sc.nextLine();
			System.out.print("Name: ");
			employee.setName(sc.nextLine());
			System.out.print("Salary: ");
			employee.setSalary(sc.nextDouble());
			employees.add(employee);
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		if (employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null) == null) {
			System.err.println("Id not found");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextInt();
			Employee employeeIncreased = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			employeeIncreased.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		sc.close();

	}

}
