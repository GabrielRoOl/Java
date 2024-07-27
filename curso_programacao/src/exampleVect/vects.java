package exampleVect;

import java.util.Locale;
import java.util.Scanner;

public class vects {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double soma = 0;
		
		for(int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		for(int j = 0; j < n; j++) {
			System.out.println(vect[j]);
		}
		System.out.println(soma);
	}

}
