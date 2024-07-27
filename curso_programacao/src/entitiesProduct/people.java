package entitiesProduct;

public class people {
	private String name;
	private int idade;
	private double altura;

	public people(String name, int idade, double altura) {
		this.name = name;
		this.idade = idade;
		this.altura = altura;
	}

	public String getName() {
		return name;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

}
