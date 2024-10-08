package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import modal.entities.Contract;
import modal.entities.Installment;
import modal.service.ContractService;
import modal.service.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), dtf);
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Enter the number of installmenst: ");
		int n = sc.nextInt();
		
		ContractService cs = new ContractService(new PaypalService());

		cs.processContract(contract, n);

		System.out.print("\nInstallments: \n");
		
		for(Installment installment : contract.getInstallment()) {
			System.out.println(installment);
		}
		sc.close();
	}

}
