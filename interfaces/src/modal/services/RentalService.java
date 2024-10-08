package modal.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	  private Double priceHour;
	  private Double priceDay;
	   
	  private TaxService taxService;
	  

	  public RentalService(Double priceHour, Double priceDay, TaxService taxService) {
		this.priceHour = priceHour;
		this.priceDay = priceDay;
		this.taxService = taxService;
	  }


	public Double getPriceHour() {
		return priceHour;
	}


	public void setPriceHour(Double priceHour) {
		this.priceHour = priceHour;
	}


	public Double getPriceDay() {
		return priceDay;
	}

	public void setPriceDay(Double priceDay) {
		this.priceDay = priceDay;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = priceHour * Math.ceil(hours);
		}
		else {
			basicPayment = priceDay * Math.ceil(hours / 24);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
