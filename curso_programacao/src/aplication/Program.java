package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitesaplication.Client;
import entitesaplication.Order;
import entitesaplication.OrderItem;
import entitesaplication.Product;
import entitesaplication.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, client);

		System.out.println();
		System.out.print("How many items to this order? ");
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");

			System.out.print("Product name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			Double priceProduct = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();

			Product product = new Product(nameProduct, priceProduct);

			OrderItem orderItem = new OrderItem(quantity, priceProduct, product);

			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println(order);

		sc.close();

	}

}
