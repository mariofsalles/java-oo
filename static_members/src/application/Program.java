package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter with the radius: ");
		double radius = sc.nextDouble();

		double c = circunference(radius);
		double v = volume(radius);

		System.out.printf("\nThe circunference area is %.2f\n", c);
		System.out.printf("The circunference volume is %.2f\n", v);
		System.out.printf("The PI value is %.2f\n", PI);

		sc.close();

	}

	public static double circunference(double radius) {
		return 2 * PI * radius;
	}

	public static double volume(double radius) {
		return 4 * Math.pow(radius, 3) * PI / 3;
	}

}
