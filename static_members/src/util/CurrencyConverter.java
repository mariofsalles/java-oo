package util;

public class CurrencyConverter {

	public static double DOLLAR;

	public static double amountToPaid(double qty) {
		return qty * DOLLAR * (1 + 0.06);
	}
}
