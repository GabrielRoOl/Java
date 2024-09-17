package functional_inteface.predicate.entities.util;

import java.util.function.Predicate;

import comparator.entities.Product;

public class ProductPredict implements Predicate<Product> {

	@Override
	public boolean test(Product t) {
		return t.getPrice() >= 100.0;
	}

}
