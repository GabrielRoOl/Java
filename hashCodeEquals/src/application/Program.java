package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		/*São operações para fazer comparação entre objetos 
		 * equals: Lento, reposta 100%<> hashCode: rápido, porém resposta positiva não é 100%
		 */ 

//		String a = "Maria";
//		String b = "João";
//		
//		System.out.println(a.equals(b)); // Compare the objects
//		
//		System.out.println(a.hashCode()); // Retorna um inteiro (código) que representa a informação do objeto
//		System.out.println(b.hashCode());
		
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "test";
		String s2 = "test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		
	}

}
