package exampleVect;

import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.vectClass;

public class vectUsingClass {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		vectClass[] vect = new vectClass[n];		// aprendi  algo importante
		
		double soma = 0;
		
		for(int i = 0; i < vect.length; i++) {
			String name = sc.next();
			double price = sc.nextDouble();
			vect[i] = new vectClass(name, price);
		}

		for(int i = 0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}
		System.out.println(soma / vect.length);
		for(int i = 0; i < n; i++) {
			System.out.println(vect[i].getName());
		}
	}

}
