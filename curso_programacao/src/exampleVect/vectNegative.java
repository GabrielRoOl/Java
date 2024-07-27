package exampleVect;

import java.util.Scanner;
import java.util.Locale;

import entitiesProduct.Number;

public class vectNegative {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		Number[] vect = new Number[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			int x = sc.nextInt();
			vect[i] = new Number(x);
		}
		
		System.out.println("Numeros Negativos:");
		for(int j = 0; j < vect.length; j++) {
			if(vect[j].getNumber() < 0) {
				System.out.println(vect[j].getNumber());
			}
		}


	}

}
