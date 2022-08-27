package entities;

public class Rectangle implements Shape {

	private Double heigth;
	private Double width;

	public Rectangle(Double heigth, Double width) {
		this.heigth = heigth;
		this.width = width;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	@Override
	public double area() {
		return getHeigth() * getWidth();
	}

}
