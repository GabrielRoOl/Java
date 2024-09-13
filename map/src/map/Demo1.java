package map;

import java.util.Map;
import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		 
		Map<String, String> cookies = new TreeMap<>(); 	// TreeMap já ordena, como é uma string ordena alfabeticamente
		
		cookies.put("username", "Maria"); // operação para inserir
		cookies.put("email", "Maria@gmail.com");
		cookies.put("phone", "998741584");
	
		
		cookies.remove("email");	// removendo o email
		cookies.put("phone", "998711225");
		
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		System.out.println("\nALL COOKIES");
		
		for(String key : cookies.keySet()) { // pegando uma keySet() p/ cada conjunto
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
