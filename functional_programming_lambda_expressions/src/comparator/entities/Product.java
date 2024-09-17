package comparator.entities;

public class Product {
	
	private String name;
	private Double price;
	
	public Product() {	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static boolean statictProductPredcate(Product p) {
		return p.getPrice() >= 100;
	}
	
	// metodo não estatico
	public boolean nonStaticProductPredicate() {
		return this.price >= 100;
	}
	
	// alterando preço com o metodo não estatico
	public void nonStaticPriceUpDate() {
		price = price * 1.1;
	}
	
	// metodo não estático
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product = " + name + ", price: " + String.format("%.2f", price);
	}
	
	
}
