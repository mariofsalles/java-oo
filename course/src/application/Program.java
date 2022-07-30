package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product();
		System.out.println("Entre com os dados do produto");
		System.out.print("Nome: ");
		p1.name = sc.nextLine();
		System.out.print("Preço: ");
		p1.price = sc.nextDouble();
		System.out.print("Quantidade: ");
		p1.quantity = sc.nextInt();
		
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
