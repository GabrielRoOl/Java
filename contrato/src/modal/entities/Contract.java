package modal.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	private List<Installment> installment = new ArrayList<>();
	
	public Contract() {
	}

	public Contract(Integer number, LocalDate date2, Double totalValue) {
		this.number = number;
		this.date = date2;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public List<Installment> getInstallment() {
		return installment;
	}	
}
