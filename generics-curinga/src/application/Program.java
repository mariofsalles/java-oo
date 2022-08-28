package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Shape> shapes = new ArrayList<>();
		
		List<Rectangle> myRects = new ArrayList<>();
		myRects.add(new Rectangle(3.0, 2.0));
		myRects.add(new Rectangle(3.0, 2.0));
		System.out.println("Total area rectangle: " + String.format("%.2f",totalArea(myRects)));
		
		List<Circle> myCirc = new ArrayList<>();
		myCirc.add(new Circle(1.0));
		myCirc.add(new Circle(1.0));
		System.out.println("Total area circle: " + String.format("%.2f",totalArea(myCirc)));

		shapes.addAll(myRects);
		shapes.addAll(myCirc);
		System.out.println("Total area: " + String.format("%.2f",totalArea(shapes)));
		
	}

	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum +=  s.area();
		}
		return sum;
	}

}