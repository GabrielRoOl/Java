package entitiesProduct;

public class Number {

	private int value;
	private double value2;
	
	public Number(double number) {
		this.value2 = number;
	}

	public Number(int number) {
		this.value = number;
	}

	public int getNumber() {
		return value;
	}
	
	public double getNumberDouble() {
		return value2;
	}
	
	public double soma() {
		return value2 += value2;
	}
}
