package atividadesOrientadaAObjeto;

import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.product;

public class controleCaixa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantity;
		double price;
		String nome;
		
		System.out.println("Enter product data: ");
		System.out.print("Nome: ");
		nome = sc.next();
		System.out.print("Price: ");
		price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		quantity = sc.nextInt();
		
		product x1 = new product(nome, price, quantity);
		
		x1.setName("computador");
		System.out.println("Updated name: " + x1.getName());
		
		x1.setPrice(950.00);
		System.out.printf("Updated price: %.2f\n", x1.getPrice());
		
		System.out.println("\nProduct data: " + x1);

		System.out.print("\nEnter the number of products to be added in stock: ");
		int qtd = sc.nextInt();
		x1.addProduct(qtd);
		
		System.out.println("\nUpdated data: " + x1);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		qtd = sc.nextInt();
		x1.removeProduct(qtd);
		
		System.out.println("\nUpdated data: " + x1);
		
	}

}
