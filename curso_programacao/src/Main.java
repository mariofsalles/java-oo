import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);

		// while -> não se sabe previamente o numero de repetições a serem realizadas
		// while (n != 0) { soma += n; n = sc.nextInt(); } System.out.println(soma);

//		int soma = 0;
//		int n = sc.nextInt();
//		for (int i = 1; i <= n; i++) {
//			int valor = sc.nextInt();
//			soma += valor;
//		}
//
//		String nome = "Mario", nstr ="";
//		char ch;
//		for (int i= 0; i < nome.length();i++) {
//			ch = nome.charAt(i);
//			nstr = ch+nstr;
//		}
//		System.out.println(nstr);
//		System.out.println("-------");
//		StringBuilder input1 = new StringBuilder();
//		input1.append(nome);
//		input1.reverse();
//		System.out.println(input1);
//		System.out.println("-------");
//		
//		
//		String[] splited = sc.next().split("");
//		String reverse = "";
//		for (int i = (splited.length -1); i >= 0; i--  ) {
//			reverse = reverse.concat(splited[i]);		
//		}
//		System.out.println(reverse);			

//		char repetir;
//		do {
//			System.out.print("Digite a temperatura em Celsius:");
//			double tempC = sc.nextDouble();
//			double tempF = 9 * tempC / 5 + 32;
//			System.out.printf("Equivalente Fahrenheit: %.1f%n", tempF);
//			System.out.print("Deseja repetir?(s/n):");
//			repetir = sc.next().charAt(0);
//		} while (repetir == 's');
//		System.out.print("Programa encerrado");
		 
		
		sc.close();
	}
}