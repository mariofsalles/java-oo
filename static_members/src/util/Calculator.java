package util;

public class Calculator {
	
	public final double PI = 3.14159;

	public double circunference(double radius) {
		return 2 * PI * radius;
	}

	public double volume(double radius) {
		return 4 * Math.pow(radius, 3) * PI / 3;
	}

}
