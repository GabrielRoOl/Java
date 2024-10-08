package aplication;

import entitiesAccount.Account;
import entitiesAccount.BusinessAccount;
import entitiesAccount.SavingsAccount;

public class ProgramHerança {

	public static void main(String[] args) {
		 
//		Account acc = new Account(1001, "Alex", 0.0);
//		
//		BusinessAccount bacc = new BusinessAccount(1002, "Bia", 0.0, 500.0);
//		
//		// UPCASTING
//		
//		Account acc1 = bacc;
//		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
//		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
//		
//		// DOWNCASTING
//		
//		BusinessAccount acc4 = (BusinessAccount)acc2;
//		acc4.loan(100.0);
//		
//		// BusinessAccount acc5 = (BusinessAccount)acc3;
//		if(acc3 instanceof BusinessAccount) {
//			BusinessAccount acc5 = (BusinessAccount)acc3;
//			acc5.loan(100.0);
//			System.out.println("Loan!");
//		}
//		if(acc3 instanceof SavingsAccount) {
//			SavingsAccount acc5 = (SavingsAccount) acc3;
//			acc5.upDateBalance();
//			System.out.println("Update!");
//		}
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Lia", 1000.0, 0.01);
		acc2.withdraw(200);
		
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 0.01);
		acc3.withdraw(200.0);
		
		System.out.println(acc3.getBalance());
		
		
	}

}
