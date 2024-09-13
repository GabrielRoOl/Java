package excluir_depois;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int nota100, nota50, nota20, nota10, nota5, nota2, nota1;
		
		nota100 = n / 100;
		n = n % 100;
		nota50 = n / 50;
		n = n % 50;
		nota20 = n / 20;
		n = n % 20;
		nota10 = n / 10;
		n = n % 10;
		nota5 = n / 5;
		n = n % 5;
		nota2 = n / 2;
		n = n % 2;
		nota1 = n;
		
		
		
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(nota1 + " nota(s) de R$ 1,00");
	}

}
