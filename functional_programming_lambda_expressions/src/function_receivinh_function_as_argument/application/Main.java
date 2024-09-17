package function_receivinh_function_as_argument.application;

import java.util.ArrayList;
import java.util.List;

import comparator.entities.Product;
import function_receivinh_function_as_argument.services.ProductServices;

public class Main {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));

		
		
		ProductServices ps = new ProductServices();
		
		double sum = ps.filteredSum(list);
		
		System.out.println("Sum = " + String.format("%.2f", sum));
	}

}
