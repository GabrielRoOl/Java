package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		method1();		
		
		
		
		
		
		// InputMismatchException = Letra no lugar de número, ArrayIndexOutOfBoundsException = número maior que o vetor
		
		
		System.out.println("Fim programa.");
		sc.close();

	}

	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" "); // Vai ser varios  dados por linha, separados por um espaço em branco
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();  // mostra onde ocorreu o erro, sem finalizar o programa
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error.");
		}
		System.out.println("***METHOD2 END***");
		sc.close();
	}
}
