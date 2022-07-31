package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {


	public static void main(String[] args) {
		
		Calculator c = new Calculator();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter with the radius: ");
		double radius = sc.nextDouble();

		var pi = c.PI;
		var circ = c.circunference(radius) ;
		var vol = c.volume(radius) ;

		System.out.printf("\nThe circunference area is %.2f\n", circ);
		System.out.printf("The circunference volume is %.2f\n", vol);
		System.out.printf("The PI value is %.2f\n", pi);

		sc.close();

	}



}
