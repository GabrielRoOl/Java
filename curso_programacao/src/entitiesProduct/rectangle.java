package entitiesProduct;

public class rectangle {
	public double height, width;
	
	public double area() {
		return height * width;
	}
	public double perimeter() {
		return (height + width) * 2;
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
	}
}
