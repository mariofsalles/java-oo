package application;

public class Program {

	public static void main(String[] args) {

		String[] vect = new String[] { "a", "b", "c", "d" };
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		System.out.println("----------------------");
		for (Object elem : vect) {
			System.out.println(elem);
		}

	}

}
