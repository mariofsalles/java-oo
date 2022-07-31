package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		System.out.println("Entre com os dados do produto");

		System.out.print("Nome: ");
		String name = sc.nextLine();

		System.out.print("Preço: ");
		double price = sc.nextDouble();

		Product p1 = new Product(name, price);

		System.out.println();
		System.out.println(p1);
		System.out.println();

		System.out.print("Entre com o número de produtos a ser adicionado no estoque: ");
		int qty = sc.nextInt();
		p1.addQuantity(qty);

		System.out.println();
		System.out.println(p1);
		System.out.println();

		System.out.print("Entre com o número de produtos a ser removidos do estoque: ");
		qty = sc.nextInt();
		p1.removeQuantity(qty);

		System.out.println();
		System.out.println(p1);
		System.out.println();

		sc.close();
	}

}
