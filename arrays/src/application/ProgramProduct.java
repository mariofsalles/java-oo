package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		//// tipo referencia:
		Product[] vect = new Product[n];

		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			String name = sc.nextLine();			
			double price = sc.nextDouble();			
			sc.nextLine();			
			vect[i] = new Product(name, price);
			soma += vect[i].getPrice();
		}

		System.out.printf("AVERAGE PRICE = %.2f", soma / vect.length);
		
////      tipo valor:
//		double[] vect = new double[n];
//
//		double soma = 0;
//		for (int i = 0; i < vect.length; i++) {
//			vect[i] = sc.nextDouble();
//			soma += vect[i];
//		}
//
//		System.out.printf("AVERAGE HEIGTH = %.2f", soma / vect.length);

		sc.close();
	}

}
