package atividadesOrientadaAObjeto;

import entitiesProduct.rectangle;

import java.util.Locale;
import java.util.Scanner;

public class atividadeRetangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		rectangle a;
		a = new rectangle();

		System.out.println("Enter rectangle width and height:");

		a.height = sc.nextDouble();
		a.width = sc.nextDouble();

		System.out.println("Area = " + String.format("%.2f", a.area()));
		System.out.println("Perimeter = " + String.format("%.2f", a.perimeter()));
		System.out.println("Diagonal = " + String.format("%.2f", a.diagonal()));

	}

}
