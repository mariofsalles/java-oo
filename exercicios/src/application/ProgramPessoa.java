package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class ProgramPessoa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão inseridas? ");
		int n = sc.nextInt();
		sc.nextLine();

		Pessoa[] vetPessoa = new Pessoa[n];

		double soma = 0;
		String pessoasMenoresDezesseis = "";
<<<<<<< HEAD
		
=======
>>>>>>> 41baf6947dc6f7bf6b458746fa61b1e0cf3da91f
		int countIdadeMenorDezesseis = 0;
    
		for (int i = 0; i < vetPessoa.length; i++) {
			System.out.printf("\nDados da %dª pessoa:\n", i + 1);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sc.nextLine();
			vetPessoa[i] = new Pessoa(name, age, height);
			soma += vetPessoa[i].getHeight();
			if (vetPessoa[i].getAge() < 16) {
				countIdadeMenorDezesseis += 1;
				pessoasMenoresDezesseis += vetPessoa[i].getAge() + "\n";
<<<<<<< HEAD
=======
				pessoasMenoresDezesseis += vetPessoa[i].getName() + "\n";
>>>>>>> 41baf6947dc6f7bf6b458746fa61b1e0cf3da91f
			}
		}

		double percentMenor16 = percentualMenorDezesseis(countIdadeMenorDezesseis, vetPessoa.length);
		double alturaMedia = alturaMedia(soma, vetPessoa.length);

		System.out.printf("\nAltura média das pessoas: %.2f%n", alturaMedia);
		System.out.printf("Percentual com menos de 16 anos: %.1f%%\n", percentMenor16);
<<<<<<< HEAD
		System.out.printf("Pessoas com menos de 16 anos:\n%s", pessoasMenoresDezesseis);
=======
		System.out.printf("Pessoas com menos de 16 anos: %s\n", pessoasMenoresDezesseis);
>>>>>>> 41baf6947dc6f7bf6b458746fa61b1e0cf3da91f

		sc.close();
	}

	public static double percentualMenorDezesseis(int contador, int tamanhoVetor) {
		return contador / (double) tamanhoVetor * 100;
	}

	public static double alturaMedia(double soma, int tamanhoVetor) {
		return soma / tamanhoVetor;
	}

}
