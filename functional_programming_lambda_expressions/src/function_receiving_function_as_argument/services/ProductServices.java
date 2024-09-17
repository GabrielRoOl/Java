package function_receiving_function_as_argument.services;

import java.util.List;
import java.util.function.Predicate;

import comparator.entities.Product;

public class ProductServices {

	public double filteredSum(List<Product> list, Predicate<Product> criterio) {
		double sum = 0.0;
		for (Product p : list) {
			if (criterio.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
