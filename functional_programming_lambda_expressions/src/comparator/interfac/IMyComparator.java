package comparator.interfac;

import java.util.Comparator;

import comparator.entities.Product;

public class IMyComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); // comparando p1 com p2
	}

}
