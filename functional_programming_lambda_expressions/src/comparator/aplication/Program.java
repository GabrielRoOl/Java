package comparator.aplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import comparator.entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));

		/*
		 sintaxe usando lambda (função anonima) - arrow function
		Comparator<Product> compLambda = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		 */ 
		
		/* sintaxe de classe anonima
		Comparator<Product> comp = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
			}
		};

		list.sort(new IMyComparator());
		*/
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
