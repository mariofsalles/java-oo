package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> shapes = new ArrayList<>();

		System.out.print("Enter the numeber of shapes: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Shape #%d data\n", i + 1);
			System.out.print("Rectangle or Circle (r/c)? ");
			char opt = sc.next().charAt(0);
			sc.nextLine();
			System.out.printf("Color(BLUE/BLACK/RED): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			sc.nextLine();

			switch (opt) {
			case 'r':
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Heigth: ");
				double heigth = sc.nextDouble();
				Rectangle rectangle = new Rectangle(color, width, heigth);
				shapes.add(rectangle);
				break;
			case 'c':
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				Circle circle = new Circle(color, radius);
				shapes.add(circle);
				break;
			default:
				break;
			}
		}

		System.out.println("\nSHAPE AREAS: ");
		for (Shape shape : shapes) {
			System.out.printf("%.2f\n", shape.area());
		}

		sc.close();

	}
}
