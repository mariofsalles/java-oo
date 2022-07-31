package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {


	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter with the radius: ");
		double radius = sc.nextDouble();

		System.out.printf("\nThe circunference area is %.2f\n", Calculator.circunference(radius));
		System.out.printf("The circunference volume is %.2f\n", Calculator.volume(radius));
		System.out.printf("The PI value is %.2f\n", Calculator.PI);

		sc.close();

	}



}
