package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		/* A List aceita apenas Wripper Class
		 * int 		=  		Integer
		 * float	= 		Float
		 * double 	= 		Double
		 * byte 	=		Byte
		 * char		= 		character
		 * boolean	=		Boolean	
		 * long		= 		Long*/
		
		List<String> list = new ArrayList<>();
		
		/* Adicionar elementos */
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		/* Adicionar entre */
		
		list.add(2, "Marco");
		
		/* Tamanho da lista */
		
		System.out.println(list.size());
		
		System.out.println("______________________________________\n");
				
		for(String k : list) {
			System.out.println(k);
		}

		/* Remover um elemento da lista */
		
		// list.remove(0);
		//list.remove("Bob");
		list.removeIf(x -> x.charAt(0) == 'M');
		
		
		System.out.println("______________________________________\n");
		for(String k : list) {
			System.out.println(k);
		}
		
		
		System.out.println("______________________________________\n");
		
		/* Encontrar um elemento */
		
		System.out.println("Index of Bob: " + list.indexOf("Ana"));
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Alex"));
		System.out.println("Index of Bob: " + list.indexOf("Gabriel"));
		
		
		System.out.println("______________________________________\n");
		
		/* Filtrar lista */
		
		List<String> result =  list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String y : result) {
			System.out.println(y);
		}
		
		
		System.out.println("______________________________________\n");
		
		
		/* Encontrar um elemento expecifico */
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
		
		String name2 = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
		
		System.out.println(name2);
		
		
		
		
	}

}
