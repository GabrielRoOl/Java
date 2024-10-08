package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import modal.services.BrazilTaxService;
import modal.services.RentalService;
import model.entities.CarRental;
import model.entities.Vehicle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rental data: ");

		try {
			System.out.print("Car model: ");
			String carModel = sc.nextLine();
			
			System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
			LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
			
			System.out.print("Return (dd/MM/yyyy hh:ss): ");
			LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);

			CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
			
			System.out.print("Enter price per hour: ");
			Double priceHour = sc.nextDouble();
			
			System.out.print("Enter price per day: ");
			Double priceDay = sc.nextDouble();
			
			RentalService rs = new RentalService(priceHour, priceDay, new BrazilTaxService());
			
			rs.processInvoice(cr);
			
			System.out.println("\nINVOICE:");
			System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
			System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
			System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
			
			
			
		}
		catch(DateTimeParseException e) {
			System.out.println("Incorrect format. Please enter whit format (dd/MM/yyyy hh:ss).");
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid input. Please enter a integer.");
		}
		
		sc.close();
	}

}
