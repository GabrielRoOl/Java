package exampleVect;

import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.Number;

public class vectDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double soma = 0;
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		Number[] vect = new Number[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			double x = sc.nextDouble();
			vect[i] = new Number(x);
			soma += x;
		}
		
		System.out.println();
		
		System.out.print("Valores =");
		for(int j = 0; j < vect.length; j++) {
			System.out.print(" " + vect[j].getNumberDouble());
		}
		System.out.println("\nSoma = " + soma);
		System.out.println("Media = " + (soma / vect.length));
	}

}
