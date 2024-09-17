package function_receivinh_function_as_argument.services;

import java.util.List;

import comparator.entities.Product;

public class ProductServices {

	public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for (Product p : list) {
			if (p.getName().charAt(0) == 'T') {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
