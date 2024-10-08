package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.Juridica;
import entities.Servidor;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Servidor> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			while(ch != 'i' && ch != 'c') {
				System.out.println("invalid option, please try again:");
				ch = sc.next().charAt(0);
			}
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			
			switch (ch) {
			case('i'):
				System.out.print("Helth expenditures: ");
				Double expeditures = sc.nextDouble();
				list.add(new Individual(name, income, expeditures));
				break;
			case('c'):
				System.out.print("Number of employee: ");
				int employee = sc.nextInt();
				list.add(new Juridica(name, income, employee));
				break;
			default:
				System.out.println("Não sei.");
					
			}
			
		}
		
		System.out.println("\nTAXES PAID:");
		for(Servidor ser : list) {
			System.out.println(ser.getName() + ": $ " + String.format("%.2f", ser.tax()));
		}
		
		double sum = 0;
		for(Servidor ser : list) {
			sum += ser.tax();
		}

		System.out.printf("\nTOTAL TAXES: $ %.2f", sum);

		sc.close();
	}

}
