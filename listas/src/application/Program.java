package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");

		// adiciona um elemento entre Alex e Bob, posição 2
		list.add(2, "Marco");

		// imprime o tamanho da lista
		System.out.println(list.size());

		System.out.println("--------------------------");
		// remove o elemento da posição 1
		// list.remove(1);

		// remove o elemento chamado Ana
		// list.remove("Ana");

		for (String elem : list) {
			System.out.println(elem);
		}

		System.out.println("--------------------------");

		// remove os elementos iniciado com M
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String elem : list) {
			System.out.println(elem);
		}
		System.out.println("--------------------------");

		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		System.out.println("--------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String elem : result) {
			System.out.println(elem);
		}
		System.out.println("--------------------------");
		String name = list.stream().filter(x -> x.charAt(0)=='J').findFirst().orElse("Não tem!");
		System.out.println(name);
		
		
	}

}
