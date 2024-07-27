package modal.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Installment {
	private LocalDate dueDate;
	private Double ammout;
	
	private static 	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	public Installment() {
	}

	public Installment(LocalDate localDate, Double ammout) {
		this.dueDate = localDate;
		this.ammout = ammout;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmmout() {
		return ammout;
	}

	public void setAmmout(Double ammout) {
		this.ammout = ammout;
	}

	@Override
	public String toString() {
		return dueDate.format(dtf) + " -" + String.format("%.2f", ammout);
	}
	
}
