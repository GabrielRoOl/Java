package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char tipo = sc.next().charAt(0);
			while(tipo != 'u' && tipo != 'i' && tipo != 'c') {
				System.out.println("Invalid input, please enter (c/u/i).");
				tipo = sc.next().charAt(0);
			}
			sc.nextLine();
			
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(tipo == 'c') {
				list.add(new Product (name, price));
			}
			else if(tipo == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				
				list.add(new UsedProduct(name, price, date));
			}
			else if(tipo == 'i') {
				System.out.print("Customs fee: ");
				Double fee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, fee));
			}
			else {
				
			}
		}
		
		System.out.println("\nPRICE TAGS");
		for(Product product : list) {
			System.out.println(product.priceTag());
		}
		
		
		sc.close();
		
	}

}
