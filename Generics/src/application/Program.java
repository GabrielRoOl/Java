package application;

import java.util.Locale;
import java.util.Scanner;

import entites.PrintService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();
		/* Accepts values of integer, string, float type. It is type safe. */

		System.out.print("How many values: ");
		int n = sc.nextInt();

		// ps.addValue("João"); This code will no longer work

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();

		Integer x = /* (Integer) */ps.first(); // No casting is necessary

		System.out.println("First: " + x);

		sc.close();

	}

}
