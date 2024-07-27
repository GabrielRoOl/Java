package atividadesOrientadaAObjeto;

import java.util.Locale;
import java.util.Scanner;

import entitiesProduct.bankData;

public class atividadeCadastroBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int bankAccount;
		String holder;
		char initialDeposit;
		double deposit, recharge, withdraw;
		bankData novo;

		System.out.print("Enter account number: ");
		bankAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		initialDeposit = sc.next().charAt(0);

		novo = new bankData(bankAccount, holder);

		if (initialDeposit == 'Y' || initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			novo.deposit(deposit);
		}
		
		System.out.println("\nAccount data: \nAccount " + novo.toString());

		System.out.print("\nEnter a deposit value: ");
		recharge = sc.nextDouble();
		novo.deposit(recharge);
		
		System.out.println("\nUpdated account data:\nAccount " + novo.toString());

		System.out.print("\nEnter a withdraw value: ");
		withdraw = sc.nextDouble();
		novo.withDraw(withdraw);
		
		
		System.out.println("\nUpdated account data:\nAccount " + novo.toString());
		
		sc.close();
	}

}
