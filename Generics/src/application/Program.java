package application;

import java.util.Locale;
import java.util.Scanner;

import entites.PrintService;
import entites.PrintServiceString;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintServiceString ps = new PrintServiceString();
		
		System.out.print("How many values: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		
		System.out.println("First: " + ps.first());
		
		sc.close();
		
	}

}
