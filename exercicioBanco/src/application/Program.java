package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import modal.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {		
			System.out.println("Enter account data:");
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine(); 
			
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("\nEnter amount for withdraw: ");
			account.withDraw(sc.nextDouble());
			
			System.out.println("New balance: " + String.format("%.2f",account.getBalance()));
		}
		catch(IllegalArgumentException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(InputMismatchException e){
			System.out.println("Invalid input.");
		}
		
		
		sc.close();
	}

}
