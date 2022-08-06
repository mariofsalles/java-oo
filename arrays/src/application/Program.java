package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] vect = new double[n];

		double soma = 0;
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}

		System.out.printf("AVERAGE HEIGTH = %.2f", soma / vect.length);

		sc.close();
	}

}
