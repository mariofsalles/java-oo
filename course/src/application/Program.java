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

		System.out.print("Quantidade: ");
		int quantity = sc.nextInt();

		Product p1 = new Product(name, price, quantity);

		System.out.println();
		System.out.println(p1);
		System.out.println();

		System.out.print("Entre com o número de produtos a ser adicionado no estoque: ");
		int addQty = sc.nextInt();
		p1.addQuantity(addQty);

		System.out.println();
		System.out.println(p1);
		System.out.println();

		System.out.print("Entre com o número de produtos a ser removidos do estoque: ");
		int remQty = sc.nextInt();
		p1.removeQuantity(remQty);

		System.out.println();
		System.out.println(p1);
		System.out.println();

		sc.close();
	}

}
