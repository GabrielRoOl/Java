package function_interface.function.applicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import comparator.entities.Product;

public class Main {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));
	
		// Produzindo nomes em caixa alta com uma lista de Produtos fazendo conversão.
		// A função map() pega uma coleção de valores e aplica a cada valor da coleção o que escolhermos.
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}
}
