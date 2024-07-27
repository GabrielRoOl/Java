package atividadesOrientadaAObjeto;

import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.currencyConverter;

public class atividadeConversao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");
		currencyConverter.dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		currencyConverter.howDollars = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", currencyConverter.total()));

	}

}
