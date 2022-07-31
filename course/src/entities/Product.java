package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0; // opcional pois inicia com zero
	}

	public double totalValueInStock() {
		return quantity * price;
	}

	public void addQuantity(int quantity) {
		this.quantity += quantity;
	}

	public void removeQuantity(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", " + "$" + String.format("%.2f", price) + ", " + quantity + " unidades, " + "Total: $"
				+ String.format("%.2f", totalValueInStock());
	}

}
